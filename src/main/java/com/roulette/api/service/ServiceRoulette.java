package com.roulette.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roulette.api.dto.BetDTO;
import com.roulette.api.dto.OutputDTO;
import com.roulette.api.dto.RouletteDTO;
import com.roulette.api.dto.WinnerDTO;
import com.roulette.api.model.Roulette;
import com.roulette.api.repository.RepositoryMain;
import com.roulette.api.util.Constants;

/**
 * Roulette class for services
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
@Service
public class ServiceRoulette {
	@Autowired
	private RepositoryMain repositoryMain;
	@Autowired
	ObjectMapper objectMapper;
	public Long createRoulette() {
		Roulette roulette = new Roulette(Constants.CLOSED);
		Roulette outputRoulette = repositoryMain.save(roulette);

		return outputRoulette.getIdRoulette();
	}
	public OutputDTO openRoulette(Long id) {
		OutputDTO outputDTO = new OutputDTO();
		Optional<Roulette> roulette = repositoryMain.findById(id);
		if (roulette.isPresent()) {
			Roulette request = roulette.get();
			if (request.getStatus().equals(Constants.CLOSED)) {
				request.setBetList(null);
			}
			request.setStatus(Constants.OPEN);
			repositoryMain.save(request);
			outputDTO.setOutputMessage(Constants.SUCCESS_OPERATION);
			outputDTO.setStatusCode(Constants.STATUS_OK);
		} else {
			outputDTO.setOutputMessage(Constants.FAILED_OPERATION);
			outputDTO.setStatusCode(Constants.BAD_REQUEST);
		}

		return outputDTO;
	}
	public OutputDTO closeRoulette(Long id) {
		Optional<Roulette> optionalRoulette = repositoryMain.findById(id);
		OutputDTO output = new OutputDTO();
		if (optionalRoulette.isPresent()) {
			Roulette roulette = optionalRoulette.get();
			roulette.setStatus(Constants.CLOSED);
			repositoryMain.save(roulette);
			List<BetDTO> betsConnected = objectMapper.convertValue(roulette.getBetList(),
					new TypeReference<List<BetDTO>>() {
					});
			output = chooseWinner(betsConnected);
			output.setStatusCode(Constants.STATUS_OK);
			output.setOutputMessage(Constants.ROULETTE_CLOSED);
			output.setBetsConnected(betsConnected);
		} else {
			output.setStatusCode(Constants.NOT_FOUND);
			output.setOutputMessage(Constants.ROULETTE_NOT_AVALILABLE);
		}

		return output;
	}
	private OutputDTO chooseWinner(List<BetDTO> betsDTO) {
		Long randomNumber = (long) (Math.random() * 36);
		OutputDTO outputDTO = new OutputDTO();
		outputDTO.setWinnerNumber(randomNumber);
		WinnerDTO winnerDTO = null;
		for (BetDTO betDTO : betsDTO) {
			boolean isNumberSelected = isNumberSelected(betDTO);
			if(isNumberSelected && isWinnerNumber(betDTO, randomNumber)) {
				winnerDTO = new WinnerDTO(betDTO.getIdUser(), betDTO.getMoney() * 5);		
			}else if(isColorSelected(betDTO) && isWinnerColor(betDTO, randomNumber)) {
				winnerDTO = new WinnerDTO(betDTO.getIdUser(), betDTO.getMoney() * 1.8);
			}
			outputDTO.addWinner(winnerDTO);
		}
		
		return outputDTO;
	}
	private boolean isWinnerNumber(BetDTO bet, Long randomNumber) {
		
		return bet.getNumber() == randomNumber ? true : false;
	}	
	private boolean isNumberSelected(BetDTO betDTO) {
		
		return betDTO.getNumber() != null ? true : false;
	}
	private boolean isWinnerColor(BetDTO betDTO, Long randomNumber) {
		boolean isWinnerColor = false;
		if(betDTO.getColor().equalsIgnoreCase(Constants.BLACK_COLOR) && randomNumber % 2 != 0) {
			isWinnerColor = true;
		} else if(betDTO.getColor().equalsIgnoreCase(Constants.RED_COLOR) && randomNumber % 2 == 0) {
			 isWinnerColor = true;
		} 
		
		return isWinnerColor;
	}	
	private boolean isColorSelected(BetDTO betDTO) {
		
		return betDTO.getColor() != null ? true : false;
	}
	public List<RouletteDTO> listRoulettes() {		
		List<Roulette> outputDTO = new ArrayList<>();
		repositoryMain.findAll().forEach(outputDTO::add);
		List<RouletteDTO> response = objectMapper.convertValue(outputDTO, new TypeReference<List<RouletteDTO>>() {
		});
		
		return response;
	}
}

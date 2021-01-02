package com.roulette.api.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Allow to show the results or status of some action
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
@JsonInclude(Include.NON_NULL)
public class OutputDTO {
	private int statusCode;
	private String outputMessage;
	private Long winnerNumber;
	private List<BetDTO> betsConnected;
	private List<WinnerDTO> winners;
	public OutputDTO() {
		betsConnected = new ArrayList<>();
		winners = new ArrayList<>();
	}
	public int getStatusCode() {

		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getOutputMessage() {

		return outputMessage;
	}
	public void setOutputMessage(String outputMessage) {
		this.outputMessage = outputMessage;
	}
	public void setBetsConnected(List<BetDTO> betsConnected) {
		this.betsConnected = betsConnected;
	}
	public List<BetDTO> getBetsConnected() {
		
		return betsConnected;
	}
	public void setWinnerNumber(Long winnerNumber) {
		this.winnerNumber = winnerNumber;
	}
	public Long getWinnerNumber() {
		
		return winnerNumber;
	}
	public List<WinnerDTO> getWinners() {
		return winners;
	}
	public void setWinners(List<WinnerDTO> winners) {
		this.winners = winners;
	}
	public void addWinner(WinnerDTO winnerDTO) {
		if (winnerDTO != null) {
			this.winners.add(winnerDTO);
		}
	}
}

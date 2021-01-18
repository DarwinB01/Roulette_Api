package com.roulette.api.dto;

import java.util.HashMap;
import java.util.List;

import com.roulette.api.model.Bet;

/**
 * Data transfer object for mapping Roulette entity to RouletteDTO
 * 
 * @author Darwin Bonilla 
 * @version 1.0
 *
 */
public class RouletteDTO {	
	private Long idRoulette;
	private HashMap<Integer, Bet> betList;
	private String status;	
	public RouletteDTO(Long idRoulette, HashMap<Integer, Bet> betList, String status) {
		super();
		this.idRoulette = idRoulette;
		this.betList = betList;
		this.status = status;
	}
	public Long getIdRoulette() {
		
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {
		this.idRoulette = idRoulette;
	}
	public HashMap<Integer, Bet> getBetList() {
		
		return betList;
	}
	public void setBetList(HashMap<Integer, Bet> betList) {
		this.betList = betList;
	}
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

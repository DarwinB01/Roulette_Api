package com.roulette.api.dto;

import java.util.List;

/**
 * Data transfer object for mapping Roulette entity to RouletteDTO
 * 
 * @author Darwin Bonilla 
 * @version 1.0
 *
 */
public class RouletteDTO {	
	private Long idRoulette;
	private List<BetDTO> betList;
	private String status;
	public Long getIdRoulette() {
		
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {
		this.idRoulette = idRoulette;
	}
	public List<BetDTO> getBetList() {
		
		return betList;
	}
	public void setBetList(List<BetDTO> betList) {
		this.betList = betList;
	}
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

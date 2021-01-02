package com.roulette.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Data transfer object for mapping Bet entity to BetDTO
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
@JsonInclude(Include.NON_NULL)
public class BetDTO {	
	private Long idBet;
	private Long money;
	private String idUser;
	private String color;
	private Long number;
	private Long idRoulette;
	public Long getIdRoulette() {
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {
		this.idRoulette = idRoulette;
	}
	public Long getIdBet() {
		
		return idBet;
	}
	public void setIdBet(Long idBet) {
		this.idBet = idBet;
	}
	public Long getMoney() {
		
		return money;
	}
	public void setMoney(Long money) {
		this.money = money;
	}
	public String getIdUser() {
		
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Long getNumber() {
		
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
}

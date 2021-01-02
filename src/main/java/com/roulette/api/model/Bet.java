package com.roulette.api.model;

import org.springframework.data.redis.core.index.Indexed;

/**
 * Model for bet class
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
public class Bet {
	@Indexed
	private Long idBet;
	private Long money;
	private Long idUser;
	private String color;
	private Long number;
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
	public Long getIdUser() {
		
		return idUser;
	}
	public void setIdUser(Long idUser) {
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

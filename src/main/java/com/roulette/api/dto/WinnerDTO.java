package com.roulette.api.dto;

/**
 * Allow to know which user is the winner
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
public class WinnerDTO {
	private double acquiredMoney;
	private String idUser;
	public WinnerDTO() {
		super();
	}
	public WinnerDTO(String idUser, double acquiredMoney) {
		this.idUser = idUser;
		this.acquiredMoney = acquiredMoney;
	}
	public double getAcquiredMoney() {

		return acquiredMoney;
	}
	public void setAcquiredMoney(double acquiredMoney) {
		this.acquiredMoney = acquiredMoney;
	}
	public String getIdUser() {

		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
}

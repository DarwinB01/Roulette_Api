package com.roulette.api.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * Model for roulette class 
 * 	
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
@RedisHash("Roulette")
public class Roulette {	
	@Id
	private Long idRoulette;
	private List<Bet> betList;
	private String status;	
	public Roulette(String status) {
		this.status = status;
	}
	public Roulette() {
		betList = new ArrayList<>();
	}
	public Long getIdRoulette() {
		
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {		
		this.idRoulette = idRoulette;
	}
	public List<Bet> getBetList() {
		
		return betList;
	}
	public void setBetList(List<Bet> betList) {
		this.betList = betList;
	}
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void addBetToList(Bet bet) {
		betList.add(bet);	
	}
}

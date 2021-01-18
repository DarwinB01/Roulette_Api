package com.roulette.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import com.roulette.api.dto.BetDTO;

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
	private HashMap<Integer, Bet> betList;
	private String status;	
	public Roulette(String status) {
		this.status = status;
	}
	public Roulette() {
		betList = new HashMap<>();
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
	public void addBetToList(Bet bet) {
		int key = betList.size();
		betList.put(key, bet);
	}
}

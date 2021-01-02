package com.roulette.api.util;

/**
 * Constans
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
public class Constants {
	public static final int STATUS_OK = 200;
	public static final int BAD_REQUEST = 400;
	public static final int NOT_FOUND = 404;
	public static final String ROULETTE_NOT_AVALILABLE = "Ruleta no disponible";
	public static final String RED_COLOR = "rojo";
	public static final String BLACK_COLOR = "negro";
	public static final String ROULETTE_CLOSED = "Ruleta cerrada";
	public static final String ROULETTE_OPENED = "Ruleta abierta";
	public static final String SUCCESS_OPERATION = "Operación exitosa";
	public static final String FAILED_OPERATION = "Operación denegada";
	public static final String CREATE_ROULETTE = "/create_roulette";
	public static final String OPEN_ROULETTE = "/open_roulette/{id}";
	public static final String PLACE_BET = "/place_bet";
	public static final String OPEN = "open";
	public static final String CLOSED = "closed";
	public static final String CLOSE_ROULETTE = "/close_roulette/{id}";
	public static final String LIST_ROULETTES = "/list_roulettes";
}

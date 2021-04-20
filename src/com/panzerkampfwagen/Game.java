package com.panzerkampfwagen;

/**
 * Maga a játék végkimenetelét és folyamatát kezeli.
 */

public class Game {
	private static boolean gameInProgress = false;

	/**
	 * gameInProgress-t true-ra állítja, amíg ez true, meghívja a Level.tickThings()
	 * függvényt. Level inicializálásért is felel.
	 */
	public static void play() {
		gameInProgress = true;
		while (gameInProgress) {
			Level.tickThings();
		}
	}

	/**
	 * Meghívja az endgame() függvényt és kiírja, hogy győztél.
	 */
	public static void victory() {
		endGame();
		System.out.println("Győztél. Yaay.");
	}

	/**
	 * Meghívja az endgame() függvényt és kiírja, hogy vesztettél.
	 */
	public static void defeat() {
		endGame();
		System.out.println("You died.");
	}

	/**
	 * gameInProgress-t false-ra állítja és cleareli a levelt.
	 */
	public static void endGame() {
		gameInProgress = false;
		Level.clear();
	}
}

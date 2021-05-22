package edu.bean;

public class Game {
	private Player player;

	public String attack() {
		return "player attack with " + player.getWeapon();
	}

}

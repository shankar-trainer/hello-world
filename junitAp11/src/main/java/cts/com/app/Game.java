package cts.com.app;

public class Game {
  private Player player;
  
  public String attack() {
	   return "player attack with "+player.getWeapon();
  }
  public Game(Player player) {
      this.player = player;
  }

}

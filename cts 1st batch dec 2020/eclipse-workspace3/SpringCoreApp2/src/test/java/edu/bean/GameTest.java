package edu.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GameTest {

	@Mock
	Player player;

	@InjectMocks
	Game game;

	@BeforeEach
	void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void attackwithWeapon() throws Exception {
		Mockito.when(player.getWeapon()).thenReturn("gun");
		assertEquals("player attack with gun", game.attack());
	}
}

package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class GameTest {
	@Mock
	Player player;

	 //@InjectMocks
	 //Game game;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	void testAttack() {
		Game game = new Game(player);
		Mockito.when(player.getWeapon()).thenReturn("gun");

		assertEquals("player attack with gun", game.attack());

	}

}

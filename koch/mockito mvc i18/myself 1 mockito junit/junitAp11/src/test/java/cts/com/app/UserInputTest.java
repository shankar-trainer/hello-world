package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputTest {
UserInput uinput;
	@BeforeEach
	void setUp() throws Exception {
     uinput=new UserInput();
	}

	@AfterEach
	void tearDown() throws Exception {
	  
	}

	@Test
	void testInput() {
		 Assertions.assertEquals(true,  uinput.input("mohan kumar"));
			
	}

}

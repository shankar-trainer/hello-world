package app1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculatorTest {
calculator calc;
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("init called ...");
	 calc=new calculator();
	}

	@Test
	public void testAdd() {
		
		Assertions.assertEquals(12.5,calc.add(6.2f, 6.3f));
	}

}

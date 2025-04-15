package mockito;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MathApplication1 {

	@InjectMocks
	MathApplication application=new MathApplication();
	
	@Mock
	CalculatorService calculatorService;
	
	@BeforeEach
	public void setUp() {
    MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test1() {
		when(calculatorService.add(11.2, 22.3)).thenReturn(33.5);
		Assertions.assertEquals(application.add(11.2, 22.3), 33.5);
	}
	
	
}

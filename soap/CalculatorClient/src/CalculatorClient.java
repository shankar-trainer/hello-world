import com.cognizant.ws.Calculator;
import com.cognizant.ws.CalculatorImplService;

public class CalculatorClient {

	public static void main(String[] args) {
  	 CalculatorImplService service=new CalculatorImplService();
  	  Calculator calculatorImplPort = service.getCalculatorImplPort(); 
	   System.out.println(calculatorImplPort.addition(11, 2));
	   System.out.println(calculatorImplPort.subtraction(11, 2));
	   System.out.println(calculatorImplPort.multiplicaation(11, 2));
	   System.out.println(calculatorImplPort.division(11, 2));
	}
}

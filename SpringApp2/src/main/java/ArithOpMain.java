import org.capg.model.AithmeticSpel;
import org.capg.model.ArithmeticOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArithOpMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArithmeticOperation spel = ctx.getBean(ArithmeticOperation.class);

		System.out.println("addition "+spel.getAddition());
		System.out.println("subtraction "+spel.getSubtraction());
		System.out.println("Multiplication  "+spel.getMultiplication());
		System.out.println("Division  "+spel.getDivision());
		System.out.println("Modulus  "+spel.getModulus());
		System.out.println("Power  "+spel.getPower());
		System.out.println("Multiplier  "+spel.getMultiplier());
	}
}

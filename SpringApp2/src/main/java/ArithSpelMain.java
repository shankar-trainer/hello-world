import org.capg.model.AithmeticSpel;
import org.capg.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArithSpelMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AithmeticSpel spel = ctx.getBean("logical",AithmeticSpel.class);

		System.out.println(spel.isAnd());
		System.out.println(spel.isOr());
		System.out.println(spel.isNot());
		System.out.println(spel.getCount());
		
	}
}

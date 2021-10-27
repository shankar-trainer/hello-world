import org.capg.model.Bank;
import org.capg.model.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bank bank = ctx.getBean("bank", Bank.class);

		System.out.println(bank.getBankRegNo());
		System.out.println(bank.getBankName());
		System.out.println(bank.getBankLocation());
		System.out.println("\nmanager \n");

		Manager m = bank.getManger();
		System.out.println("\t" + m.getManagerId());
		System.out.println("\t" + m.getManagerName());
	}
}

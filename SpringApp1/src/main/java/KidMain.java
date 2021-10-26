import org.capg.Kid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KidMain {

	public static void main(String[] args) {
		// ApplicationContext ctx
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Kid kid = ctx.getBean("kid1", Kid.class);

		System.out.println("kids information");
		System.out.println("reg no " + kid.getKidRegNo());
		System.out.println("name " + kid.getKidName());
		System.out.println("age  " + kid.getKidAge());

		System.out.println("\nkids birthday");
		System.out.println("\tday " + kid.getBday().getDay());
		System.out.println("\tmonth " + kid.getBday().getMonth());
		System.out.println("\tyear " + kid.getBday().getYear());
		ctx.close();
	}
}

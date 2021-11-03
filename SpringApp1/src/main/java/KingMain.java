import org.capg.annotation.config.KingConfig;
import org.capg.annotation.model.King;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KingMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(KingConfig.class);

		King bean = ctx.getBean(King.class);
		King bean1 = ctx.getBean(King.class);
		
		bean1.setKingCapital("delhi");
		bean1.setKingCountry("dilli ");
		bean1.setKingName("suraj mal ");
		
		System.out.println(bean.getKingName());
		System.out.println(bean.getKingCountry());
		System.out.println(bean.getKingCapital());
		
		System.out.println("\n");

		
		System.out.println(bean1.getKingName());
		System.out.println(bean1.getKingCountry());
		System.out.println(bean1.getKingCapital());
		

		
	}
}

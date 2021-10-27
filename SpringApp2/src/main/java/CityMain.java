import org.capg.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		City bean1 = ctx.getBean("city1",City.class);
		//City bean2 = ctx.getBean("city2",City.class);
		
		
		System.out.println("first city data ");
		System.out.println("\t"+bean1.getName());
		System.out.println("\t"+bean1.getState());
		System.out.println("\t"+bean1.getPopulation());
		System.out.println("\t"+bean1.getCityList());
		
//		
//		System.out.println("\nsecond city data ");
//		System.out.println("\t"+bean2.getName());
//		System.out.println("\t"+bean2.getState());
//		System.out.println("\t"+bean2.getPopulation());
//		System.out.println("\t"+bean2.getCityList());
//		
		
	}
}

import java.util.Properties;
import java.util.Set;

import org.capg.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		User user = factory.getBean("user1", User.class);
		
		System.out.println("id is "+user.getUserId());
		System.out.println("name is "+user.getUserName());
		System.out.println("age is "+user.getUserAge());

		System.out.println("product list");
		
		System.out.println(user.getPrdList());
		
		System.out.println("product list\n");
		
		for (String string :user.getPrdList()) {
			System.out.println("\t"+string);
		}
	
		System.out.println("using stream ");
		user.getPrdList().stream().forEach(a->System.out.println(a));
		
		System.out.println("\nlocations are ");
		user.getLocationSet().stream().forEach(a->System.out.println("\t"+a));
		
		System.out.println("\ndepartment are ");
		user.getUserDepartment().values().forEach(a->System.out.println("\t"+a));
		
		System.out.println("\ndepartment id are ");
		user.getUserDepartment().keySet().forEach(a->System.out.println("\t"+a));


		System.out.println("\nstates id and names are ");
		Properties userState = user.getUserState();
		
		Set<Object> keySet = userState.keySet();
        for (Object object : keySet) {
			System.out.println("\t"+object+" ------>  "+userState.get(object));
		}		
		

		
	}
}

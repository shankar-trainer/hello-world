

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cts.com.model.Library;
import cts.com.model.Member;

public class LibraryMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		Library library = ctx.getBean(Library.class);

		System.out.println(library);

//		Member member = ctx.getBean("member1", Member.class);
//		System.out.println(member);
	}
}

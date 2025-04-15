import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cts.com.model.Member;

public class MemberMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("application.xml");


		Member member = ctx.getBean("member1", Member.class);
		System.out.println(member);
	}
}

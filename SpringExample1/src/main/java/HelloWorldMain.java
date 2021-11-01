import org.capg.model.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {

	public static void main(String[] args) {
		BeanFactory beanFactory;
		beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("hello");
		helloWorld.welcome();

	}
}

package pooky.projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Starting...");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		ApplicationContext context = new AnnotationConfigApplicationContext(MessagePrinter.class);
      
		MessagePrinter printer = context.getBean(MessagePrinter.class);
	    printer.printMessage();

	    
	}

}

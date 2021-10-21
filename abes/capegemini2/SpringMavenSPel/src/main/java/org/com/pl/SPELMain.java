package org.com.pl;
 
import org.com.spel.ArithmeticSpel;
import org.com.spel.Employee;
import org.com.spel.LogicalSpel;
import org.com.spel.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SPELMain {

	public static void main(String[] args) {

		 
		  ApplicationContext
		  beanFactory = new ClassPathXmlApplicationContext("beans.xml");

ArithmeticSpel aspel=beanFactory.getBean("aspel",ArithmeticSpel.class);
		  System.out.println(aspel.getAdd());
		  System.out.println(aspel.getSubtract());
		  System.out.println(aspel.getMultiply());
		  System.out.println(aspel.getDivision());
		  System.out.println(aspel.getModulus());
		  System.out.println(aspel.getPowerOf());
		  System.out.println(aspel.getDivisionAlpha());
		  System.out.println(aspel.getMultiplier());
		  
		  
		  LogicalSpel logicalSpel = beanFactory.getBean
				  ("logical",LogicalSpel.class);
		 
		  System.out.println(logicalSpel.isAnd());
		  System.out.println(logicalSpel.isOr());
		  System.out.println(logicalSpel.isNot());
		  
		  Employee emp = beanFactory.getBean("emp",Employee.class);
		  System.out.println(emp);
		  
		  Phone ph = beanFactory.getBean("phone",Phone.class);
		  System.out.println(ph);
		  
	}
}

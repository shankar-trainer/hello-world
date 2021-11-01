package ogg.capg.main;


import org.capg.model.Currency;
import org.capg.model.CurrencyConverterImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverTerMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		Currency currency = beanFactory.getBean("currency1", Currency.class);
		CurrencyConverterImpl converter1 = beanFactory.getBean("converter1", CurrencyConverterImpl.class);
		
		
		System.out.println(converter1.convertCurrencytoDollar(currency));
		System.out.println(converter1.convertCurrencytoRupees(currency));
		
		

	}
}

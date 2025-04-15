package com.capgemini.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.CurrencyConverter;
import com.capgemini.beans.CurrencyConverterImpl;
import com.capgemini.beans.Employee;

public class CurrencyConverterMain {

	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		//CurrencyConverter currencyConverter = beanfactory.getBean("converter", CurrencyConverterImpl.class);
		CurrencyConverterImpl currencyConverter = beanfactory.getBean("converter", CurrencyConverterImpl.class);
		
		System.out.println("amount in Rs is "+currencyConverter.getAmount());
		System.out.println("exchange rate  is "+currencyConverter.getExchangeRate());
		System.out.println("dolar value "+currencyConverter.convertRsToDollar());

	}
}

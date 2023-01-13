package org.audintel;

import java.util.Map.Entry;
import java.util.Set;

import org.audintel.model.Product;
import org.audintel.model.ProductInfo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
	     BeanFactory beanFactory=new ClassPathXmlApplicationContext("context.xml");
	     ProductInfo bean = beanFactory.getBean(ProductInfo.class);
	     
	     
	     System.out.println(bean.getBookList());
	    
	     
	     System.out.println(bean.getCarSet());
	     
	     System.out.println(bean.getPrdMap());
	    
	    System.out.println("==================================");
	     System.out.println("book list ");
	     for(String s:bean.getBookList())
	    	 System.out.println("\t"+s);
	     
	    
	     System.out.println("car set ");
	     for(String s:bean.getCarSet())
	    	 System.out.println("\t"+s);
	     
	     
	     System.out.println("product map ");
	     for(Entry<Long, Product> entry:bean.getPrdMap().entrySet())
	    	 System.out.println("\t"+entry.getKey()+"\t"+entry.getValue());
	     
	     
	     
       		
	}
}

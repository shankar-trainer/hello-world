import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.lpu.model.Address;
import edu.lpu.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		int address_id[]= {10001,10002,10003};
		String sector[]= {"sector a","sector b ","sector c"};
		String city[]= {"new delhi","noida","gurgaon"};
		String state[]= {"delhi","up","haryana"};
			
		int pin[]= {11001,677676,76767676};
		
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
	    Session session=buildSessionFactory.openSession();
	    
	    Transaction transaction = session.getTransaction();
	    
	    Person person=new Person();
	   person.setId(1);
	   person.setName("ram kumar");
	    
	    Address address[]=new Address[3];
	    Set<Address> set1=new HashSet<Address>();
	    
	    for (int i = 0; i < address.length; i++) {
	    	address[i]=new Address();
		  address[i].setAddr_id(address_id[i]);	
		  address[i].setCity(city[i]);	
		  address[i].setState(state[i]);	
		  address[i].setSector(sector[i]);	
		  address[i].setPin(pin[i]);	
		 set1.add(address[i]);
	    }
	    
       person.setSet_address(set1);
       
       transaction.begin();
       session.save(person) ;
       for (Address address2 : set1) {
		session.save(address2);
	}
       
       
       transaction.commit();
    System.out.println("Person  Record added");	
	}
}

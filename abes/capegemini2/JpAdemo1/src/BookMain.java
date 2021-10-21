import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.com.model.Book;

public class BookMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa1");

		EntityManager emManager = factory.createEntityManager();

		EntityTransaction transaction = emManager.getTransaction();

		Scanner scanner = new Scanner(System.in);

		Book book1=null;   // doesnot exits
 
 
		book1= new Book();// new State
		
		book1.setIsbn(11111);
		book1.setBook_name("book1");
		book1.setBook_author("a kumar");
		book1.setCost(1234);
		
		book1.setPublisher("publisher1");
		
		transaction.begin();
		emManager.persist(book1);// managed state
		
		book1.setIsbn(11112);
		book1.setBook_name("book2");
		
		
		transaction.commit();

		System.out.println("Record added");

		Query query = emManager.createQuery("from Book");

		List<Book> resultList = query.getResultList();

		for (Book book : resultList) {
			System.out.println(book);
		}

	}
}

import java.util.List;

import org.capg.dao.BookInfo;
import org.capg.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookInfoMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookInfo bean = ctx.getBean(BookInfo.class);
		List<Book> blist = bean.getBlist();

		System.out.println("all books ");

		for (Book book : blist) {
			System.out.println(book);
		}

		System.out.println("\nfirst book ");
		Book bk = bean.getFirstBook();
		System.out.println(bk.getIsbn() + "  " + bk.getBname() + "  " + bk.getAuthor());

		System.out.println("\nlast book ");
		bk = bean.getLaststBook();
		System.out.println(bk.getIsbn() + "  " + bk.getBname() + "  " + bk.getAuthor());

	}
}

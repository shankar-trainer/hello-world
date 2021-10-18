package org.com.service;

import org.com.dao.BookDao;
import org.com.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDao dao;

    public boolean addBook(Book book) {

        if (!dao.findById(book.getIsbn()).isPresent()) {
            dao.save(book);

            return true;
        }
        return false;
    }


    public List<Book> getAllBook()  {

/*        Book b1 = new Book();
        b1.setBname("java book1");
        b1.setCost(456);
        dao.save(b1);

        b1 = new Book();
        b1.setBname("java book1");
        b1.setCost(456);
        dao.save(b1);


        b1 = new Book();
        b1.setBname("java book1");
        b1.setCost(456);
        dao.save(b1);
*/

        return dao.findAll();
      }
    }

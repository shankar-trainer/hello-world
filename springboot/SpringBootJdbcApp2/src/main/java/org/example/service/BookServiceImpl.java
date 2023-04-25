package org.example.service;

import org.example.dao.BookDaoImpl;
import org.example.exception.BookException;
import org.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService {
    @Autowired
    BookDaoImpl bookDao;

    @Override
    public Book addBook(Book b) throws BookException {
            Book b1=bookDao.addBook(b);

        if(b1==null)
            throw new BookException("Book already present with isbn "+b.getIsbn());
        else 
            return (b1);
    }

    @Override
    public Book updateBook(Book b) throws BookException {
        if(bookDao.updateBook(b)==null)
            throw new BookException("Book not present with isbn "+b.getIsbn());
        else {
            return bookDao.updateBook(b);
        }
    }

    @Override
    public Book searchBook(int isbn) throws BookException {

        if(bookDao.searchBook(isbn)==null)
            throw new BookException("Book not present with isbn "+isbn);
        else {
            return bookDao.searchBook(isbn);
        }
    }

    @Override
    public Book removeBook(int isbn) throws BookException {
       Book b1= bookDao.removeBook(isbn);
        if(b1==null)
            throw new BookException("Book not present with isbn "+isbn);
        else {
            return b1;
        }
    }

    @Override
    public List<Book> getAllBook() throws BookException {
        if(bookDao.getAllBook().size()==0)
            throw new BookException("Book list is empty ");
        else {
            return bookDao.getAllBook();
        }
    }
}

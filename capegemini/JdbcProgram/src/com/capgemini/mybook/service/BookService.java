package com.capgemini.mybook.service;

import java.sql.SQLException;

import com.capgemini.mybook.bean.Book;
import com.capgemini.mybook.exception.BookException;

public interface BookService {

      public	void  showAllBook() throws SQLException;
      public	void  insertBook() throws SQLException, BookException;
      
}

package com.capgemini.mybook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.mybook.bean.Book;
import com.capgemini.mybook.util.DatabaseUtil;

public class BookDaoImpl implements BookDao {
	Connection connection;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	Book book;

	HashMap<Integer, Book> hashMap;

	public BookDaoImpl() throws SQLException {
		connection = DatabaseUtil.myconnection();
		connection.setAutoCommit(false);
	}

	@Override
	public HashMap<Integer, Book> getAllBook() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from mybook");
		hashMap = new HashMap<>();
		while (rs.next()) {
			book = null;
			book = new Book();

			book.setIsbn(rs.getInt(1));
			book.setBook_name(rs.getString(2));
			book.setCost(rs.getFloat(3));
			book.setBook_author(rs.getString(4));
			hashMap.put(rs.getInt(1), book);
		}
		return hashMap;
	}

	@Override
	public Book SearchBook(int isbn) throws SQLException {
		pst = connection.prepareStatement("select * from mybook where isbn=?");
		pst.setInt(1, isbn);
		rs = null;
		rs = pst.executeQuery();

		if (rs.next()) {
			book = null;
			book = new Book();

			book.setIsbn(rs.getInt(1));
			book.setBook_name(rs.getString(2));
			book.setCost(rs.getFloat(3));
			book.setBook_author(rs.getString(4));
		 
		}  
		return book;
	}

	String ch;
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean AddBook(Book book1) throws SQLException {
		book = SearchBook(book1.getIsbn());
		if (book == null) {
		 
			pst = null;
			pst = connection.prepareStatement("insert into mybook values(?,?,?,?) ");
			pst.setInt(1, book1.getIsbn());
			pst.setString(2, book1.getBook_name());
			pst.setFloat(3, book1.getCost());
			pst.setString(4, book1.getBook_author());
			int res = pst.executeUpdate();
			if (res == 1) {
				System.out.println("Add it to database y\\n");
				ch = sc.next();
				if (ch.equalsIgnoreCase("y")) {
					connection.commit();
					return true;
				} else {
					connection.rollback();
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public boolean RemoveBook(int isbn) {
		return false;
	}

	@Override
	public boolean UpdateBook(Book book) {
		return false;
	}

}

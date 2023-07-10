package com.coforge.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.database.model.Book;

public class DatabaseOperation {

	Connection connection;
	Statement statement;
	ResultSet resultSet;

	Book book;

	public DatabaseOperation() throws ClassNotFoundException, SQLException {
		// 1.load the driver
		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		// 2.nd way to load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge", "root", "mysql");
		statement = connection.createStatement();
	}

	public Book searchBook(int isbn) throws SQLException {
		resultSet = null;
		resultSet = statement.executeQuery("select * from book where isbn=" + isbn);
		if (resultSet.next()) {
			book = null;
			book = new Book();

			book.setIsbn(resultSet.getInt(1));
			book.setBname(resultSet.getString(2));
			book.setCost(resultSet.getFloat(3));
			book.setAuthor(resultSet.getString(4));
			return book;
		}
		return null;
	}

	public boolean addBook(Book book) throws SQLException {
		if (searchBook(book.getIsbn()) == null) {
			String s="insert into book values(" + book.getIsbn() + ",'" + book.getBname() + "',"+ book.getCost() + ",'" + book.getAuthor() + "')";
			statement.executeUpdate(s);

			return true;
		}
		return false;
	}

	List<Book> list;

	public List<Book> getBookList() throws SQLException {
		resultSet = statement.executeQuery("select * from Book");
		list = null;
		list = new ArrayList<>();
		while (resultSet.next()) {
			book = null;
			book = new Book();
			book.setIsbn(resultSet.getInt(1));
			book.setBname(resultSet.getString(2));
			book.setCost(resultSet.getFloat(3));
			book.setAuthor(resultSet.getString(4));
			list.add(book);
		}
		return list;
	}

}

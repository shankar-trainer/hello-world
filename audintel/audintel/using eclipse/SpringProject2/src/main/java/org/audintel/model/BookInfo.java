package org.audintel.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("bookinfo")
public class BookInfo {
	private  List<Book> bookList;

	@Value("#{bookinfo.bookList[0]}")
	private Book firstBook;

	@Value("#{bookinfo.bookList[3]}")
	private Book lastBook;

	public BookInfo() {
		bookList = new ArrayList<>();
		bookList.add(new Book(78787, "spring microservice in action", 1509));
		bookList.add(new Book(78788, "spring microservice for beginner", 1509));
		bookList.add(new Book(78789, "spring boot in action", 1509));
		bookList.add(new Book(78780, "spring boot 5", 1509));
	}
}

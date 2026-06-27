package com.cts.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
public class Book {

    private long isbn;
    private String bname;
    private String author;
    private LocalDate publishDate;

    public Book(long isbn, String bname, String author, LocalDate publishDate) {
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
        this.publishDate = publishDate;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    @PostConstruct
    public void init(){
        this.isbn=90099;
        this.bname="java in action";
        this.bname="p kumar";
        this.publishDate=LocalDate.now();
    }

}

package com.cts.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component(value = "book1")
public class Book {

    private int isbn;
    private String bname;
    private Set<Author> authorSet;

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    //    @Autowired
    private Chapter chapter;

    public Chapter getChapter() {
        return chapter;
    }

    @Autowired
    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    @PostConstruct
    public void init() {
        System.out.println("init called ");
        Author author1 = new Author();
        Author author2 = new Author();
        author1.setAuthorName("r kumar");
        author1.setAuthorAge(34);

        author2.setAuthorName("k kumar");
        author2.setAuthorAge(35);
        this.authorSet=new HashSet<>();

        this.authorSet.add(author1);
        this.authorSet.add(author2);
        this.isbn = 98878979;
        this.bname = "spring in action";
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bname='" + bname + '\'' +
                ", chapter=" + chapter +
                ", author=" + authorSet +
                '}';
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}

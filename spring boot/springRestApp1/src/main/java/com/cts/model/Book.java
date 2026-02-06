package com.cts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;
import org.springframework.data.repository.cdi.Eager;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

//@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long isbn;
    private String name;
    private Float cost;
    private LocalDate publishDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "book_authid")
    private Author author;

    @JsonIgnoreProperties("book")
//    @OneToMany(mappedBy = "book", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "book_chapterid")
    private Set<Chapters> chaptersSet;


    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", publishDate=" + publishDate +
                ", author=" + author +

                '}';
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Chapters> getChaptersSet() {
        return chaptersSet;
    }

    public void setChaptersSet(Set<Chapters> chaptersSet) {
        this.chaptersSet = chaptersSet;
    }


}

package com.coforge.model;

import java.util.Objects;

public class Book {
    private int isbn;
    private  String  bname;
    private  float cost;

    public Book(int isbn, String bname, float cost) {
        this.isbn = isbn;
        this.bname = bname;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Float.compare(cost, book.cost) == 0 && Objects.equals(bname, book.bname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, bname, cost);
    }

    public int getIsbn() {
        return isbn;
    }

    public String getBname() {
        return bname;
    }

    public float getCost() {
        return cost;
    }
}

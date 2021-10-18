package org.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO )
    private int isbn;
    private String bname;
    private float cost;

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bname='" + bname + '\'' +
                ", cost=" + cost +
                '}';
    }
}

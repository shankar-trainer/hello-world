package spel.ex1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("#{100+2}")
    private int isbn;
    @Value("#{'ram kumar'}")
    private String bname;

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

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bname='" + bname + '\'' +
                '}';
    }
}

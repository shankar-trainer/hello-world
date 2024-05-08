
public class Book {
    int isbn;
    String bname;
    String author;
    float cost;

    float totalCost(Book b[]) {
        float t = 0;
        for (Book bk : b)
            t = t + bk.cost;
        return t;
    }

    float avgCost(Book b[]) {
        float t = 0;
        for (Book bk : b)
            t = t + bk.cost;
        return t / b.length;
    }

    void bookInfo() {
        System.out.println("\nBook Information ");
        System.out.println("\tisbn " + isbn);
        System.out.println("\tbname " + bname);
        System.out.println("\tauthor " + author);
        System.out.println("\tcost " + cost);
    }

}

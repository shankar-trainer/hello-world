public class Book {
    private long isbn;
    private String bname;
    private float cost;

    public long getIsbn() {
        return isbn;
    }

    public String getBname() {
        return bname;
    }

    public float getCost() {
        return cost;
    }

    public Book(long isbn, String bname, float cost) {
        this.isbn = isbn;
        this.bname = bname;
        this.cost = cost;
    }
}

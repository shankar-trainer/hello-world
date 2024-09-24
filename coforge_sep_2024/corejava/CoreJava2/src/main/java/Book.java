public class Book {
    private long isbn;
    private String bname;
    private String author;
    private float cost;

    public long getIsbn() {
        return isbn;
    }

    public String getBname() {
        return bname;
    }

    public String getAuthor() {
        return author;
    }

    public float getCost() {
        return cost;
    }

    //
//    public Book() {
//    }

    public Book(long isbn, String bname, String author, float cost) {
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
        this.cost = cost;
    }


}

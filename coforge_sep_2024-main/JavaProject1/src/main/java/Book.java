public class Book {
    private int isbn;
    private String bname;
    private String author;
    private float cost;

    //book has chapter -- has a relationship
    private Chapter chapter ;

    public Book(int isbn, String bname, String author, float cost, Chapter chapter) {
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
        this.cost = cost;
        this.chapter = chapter;
    }

    public int getIsbn() {
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

    public Chapter getChapter() {
        return chapter;
    }
}

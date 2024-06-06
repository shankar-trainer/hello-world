public class LiteratureBook extends  Book {

    private String author;
    private String publisherName;

    public LiteratureBook(long isbn, String bname, float cost, String author, String publisherName) {
        super(isbn, bname, cost);
        this.author = author;
        this.publisherName = publisherName;
    }
    void literatureBookInfo(){
        System.out.println("Book Information");
        System.out.println("\tisbn :"+getIsbn());
        System.out.println("\tbook name :"+getBname());
        System.out.println("\tcost :"+getCost());
        System.out.println("\tauthor :"+author);
        System.out.println("\tpublisher :"+publisherName);
    }

    public static void main(String[] args) {
        LiteratureBook literatureBook=new LiteratureBook(10001,"two states",450,"chetan bhagart","raj kamal");
        //Book book=new LiteratureBook(10001,"two states",450,"chetan bhagat","raj kamal");
        literatureBook.literatureBookInfo();
    }
}

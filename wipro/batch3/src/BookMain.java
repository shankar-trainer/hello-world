
public class BookMain {
    public static void main(String[] args) {
        Book book[] = new Book[3];// create array of 3 objects , not created book object

        //new  [] -- array creation
        //new () -- object creation

        book[0] = new Book();
        book[1] = new Book();
        book[2] = new Book();

        book[0].isbn = 77767;
        book[0].bname = "let us java";
        book[0].author = "ram kumar";
        book[0].cost = 700;

        book[1].isbn = 77769;
        book[1].bname = "java beginner";
        book[1].author = "prem kumar";
        book[1].cost = 1100;

        book[2].isbn = 77765;
        book[2].bname = "java in action";
        book[2].author = "suman kumar";
        book[2].cost = 1500;

         book[0].bookInfo();
         book[1].bookInfo();
         book[2].bookInfo();
    }
}

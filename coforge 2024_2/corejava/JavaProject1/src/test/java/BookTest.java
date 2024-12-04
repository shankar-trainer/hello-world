import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    Book book[];

    @BeforeEach
    void setup(){
        book=new Book[3];
        book[0]=new Book(10001,"java in action","p kumar",2100,
                new Chapter(1,"java basic",10));

        book[1]=new Book(10002,"java for dummies","k kumar",1100,
                new Chapter(2,"OOP",20));

        book[2]=new Book(10003,"java for beginner","suresh kumar",1200,
                new Chapter(3,"file io",30));

        for(Book b:book) {
            System.out.println("book data");
            System.out.println("\t"+b.getIsbn() +"\t"+b.getBname()+"\t"+b.getCost()+"\t"
                    +b.getAuthor());

            System.out.println("\nchapter data ");
            Chapter chp=b.getChapter();
            System.out.println(b.getChapter().getChapterNo()+"\t"+chp.getChapterName()+"\t"
                    +chp.getPageNo());
        }
    }

    @Test
    void bookTest(){
        System.out.println("test program ");
        Assertions.assertEquals(3,book.length);
        Assertions.assertNotNull(book);
        Assertions.assertNotNull(book[0]);
        Assertions.assertNotNull(book[1]);
        Assertions.assertNotNull(book[2]);

        Assertions.assertEquals(book[0].getChapter().getPageNo(),10);
        Assertions.assertEquals(book[1].getAuthor(),"k kumar");

        String nm[]=new String[book.length];
        int index=0;
        for(Book b:book)
            nm[index++]=b.getAuthor();
        index=0;
        for(String name:nm)
            Assertions.assertEquals(book[index++].getAuthor(),name);
    }
}

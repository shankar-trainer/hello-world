import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserBookTest {

    UserBook userBook;

    @BeforeEach
    public void init() {
        userBook = new UserBook(10001, "java for me", "s kumar", 1200, 0.05f, "literature");
    }

    @Test
    public void userTest1(){
        Assertions.assertEquals(userBook.getIsbn(),10001);
        assertNotNull(userBook);
        assertEquals(userBook.getAuthor(),"s kumar");
        assertEquals(userBook.getBtype(),"literature");
        assertEquals(userBook.getBname(),"java for me");
        assertEquals(userBook.getCost(),1200);
        assertEquals(userBook.getRebate(),0.05f);
    }
}

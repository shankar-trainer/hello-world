import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoadTest {

    Road road1;
    Road road2;
    @BeforeEach
    public void setUp(){
        road1=new Road(1001,"mg road",20);
        road2=new Road(1001,"mg road",20);
    }

    @Test
    public void test1(){
        Assertions.assertEquals(road1,road2);
    }

}

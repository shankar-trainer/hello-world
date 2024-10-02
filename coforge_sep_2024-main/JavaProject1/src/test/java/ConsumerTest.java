import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumerTest {

    Consumer consumer;

    @BeforeEach
    void init(){
        consumer=new Consumer(10001,"ram kumar","electricity","delhi");
    }

    @Test
    void testConsumer(){
        Assertions.assertEquals(consumer.getConsumerId(),10001);
        Assertions.assertEquals(consumer.getConsumerName(),"ram kumar");
        Assertions.assertEquals(consumer.getConsumerType(),"electricity");
        Assertions.assertEquals(consumer.getConsumerLocation(),"delhi");
    }

}

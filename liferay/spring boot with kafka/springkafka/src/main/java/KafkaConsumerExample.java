import java.time.Duration;
import java.util.*;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.*;

public class KafkaConsumerExample {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers",
                "localhost:9092");

        props.put("group.id", "my - group ");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer
                = new KafkaConsumer<>(props);
        consumer.subscribe(
                Arrays.asList("my - topic"));
        ConsumerRecords<String, String> records
                = consumer.poll(Duration.ofMillis(1000));
        for (ConsumerRecord<String, String> record :
                records)
            System.out.println(record.value());
    }
}
package abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    Service1 service1;

    @Autowired
    Service2 service2;

    @Override
    public void run(String... args) throws Exception {
       service1.hello1();
//        service2.hello2();
    }

}
//https://stackoverflow.com/questions/49668298/spring-data-jpa-bidirectional-relation-with-infinite-recursion
//https://stackoverflow.com/questions/34897343/disable-cascade-in-manytoone-relationship-jpa-when-saving
//https://stackoverflow.com/questions/7197181/jpa-unidirectional-many-to-one-and-cascading-delete
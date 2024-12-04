package abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    EmployeeRepository repository;

    @Autowired
    AddressRepository addressRepository;


    @Override
    public void run(String... args) throws Exception {

        Address address = new Address();
        address.setLocation("delhi");

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("ram kumar");
        employee2.setName("shyam kumar");
        employee3.setName("anand kumar");

        employee1.setAddress(address);
        employee2.setAddress(address);
        employee2.setAddress(address);

        addressRepository.save(address);

        repository.save(employee1);
        repository.save(employee2);
        repository.save(employee3);

       // repository.findAll().forEach(a -> System.out.println(a));

    }
}

//https://stackoverflow.com/questions/34897343/disable-cascade-in-manytoone-relationship-jpa-when-saving
//https://stackoverflow.com/questions/7197181/jpa-unidirectional-many-to-one-and-cascading-delete
https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/
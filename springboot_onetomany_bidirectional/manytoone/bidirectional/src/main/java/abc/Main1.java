package abc;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main1 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main1.class, args);
    }

    @Autowired
    EmployeeRepository repository;

    @Autowired
    AddressRepository addressRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        Address address = new Address();
        address.setLocation("delhi");
//        address.setAddr_id(1);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("ram kumar");
        employee2.setName("shyam kumar");
        employee3.setName("anand kumar");

//        employee1.setId(1001);
//        employee2.setId(1002);
//        employee3.setId(1003);

        employee1.setAddress(address);
        employee2.setAddress(address);
        employee3.setAddress(address);

        repository.save(employee1);
        repository.save(employee2);
        repository.save(employee3);

        repository.findAll().forEach(System.out::println);

        for( Employee e: repository.findAll()) {
            System.out.println(e.getId() + "\t" + e.getName());
            System.out.println("\tAddress "+e.getAddress().getAddr_id()+"\t"+e.getAddress().getLocation());
        }
    }
}
//https://stackoverflow.com/questions/34897343/disable-cascade-in-manytoone-relationship-jpa-when-saving
//https://stackoverflow.com/questions/7197181/jpa-unidirectional-many-to-one-and-cascading-delete
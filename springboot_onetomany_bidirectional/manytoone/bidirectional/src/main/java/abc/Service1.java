package abc;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Service1 {

    @Autowired
    EmployeeRepository repository;

//    @Autowired
//    AddressRepository addressRepository;

    @Transactional
    public void hello1() throws Exception {

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

        for (Employee e : repository.findAll()) {
            System.out.println(e.getId() + "\t" + e.getName());
            System.out.println("\tAddress " + e.getAddress().getAddr_id() + "\t" + e.getAddress().getLocation());
        }
    }
}
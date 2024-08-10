package abc;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Service
public class Service2
{

//    @Autowired
//    EmployeeRepository repository;

    @Autowired
    AddressRepository addressRepository;

    public void hello2() throws Exception {

        Address address = new Address();
        address.setLocation("delhi");

        Set<Employee> empSet = new HashSet<>();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("ram kumar");
        employee2.setName("shyam kumar");
        employee3.setName("anand kumar");

        employee1.setAddress(address);
        employee2.setAddress(address);
        employee3.setAddress(address);

        empSet.add(employee1);
        empSet.add(employee2);
        empSet.add(employee3);

        address.setEmpset(empSet);

        addressRepository.save(address);
        for (Address a : addressRepository.findAll()) {
            System.out.println(a.getAddr_id() + "\t" + a.getLocation());
            for (Employee e : a.getEmpset())
                System.out.println(e.getId() + "\t" + e.getName());
        }
    }
}
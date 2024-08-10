//package abc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootApplication
//public class Main implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
//    }
//
//    @Autowired
//    EmployeeRepository repository;
//
//    @Autowired
//    AddressRepository addressRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Address address = new Address();
//        address.setLocation("delhi");
//
//        List<Employee> empList = new ArrayList<>();
//
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
//        Employee employee3 = new Employee();
//
//        employee1.setName("ram kumar");
//        employee2.setName("shyam kumar");
//        employee3.setName("anand kumar");
//
//        employee1.setAddress(address);
//        employee2.setAddress(address);
//        employee3.setAddress(address);
//
//        empList.add(employee1);
//        empList.add(employee2);
//        empList.add(employee3);
//
//        address.setEmpList(empList);
//
//        addressRepository.save(address);
//        for (Address a : addressRepository.findAll()) {
//            System.out.println(a.getAddr_id() + "\t" + a.getLocation());
//            for (Employee e : a.getEmpList())
//                System.out.println(e.getId() + "\t" + e.getName());
//        }
//    }
//}
////https://stackoverflow.com/questions/34897343/disable-cascade-in-manytoone-relationship-jpa-when-saving
////https://stackoverflow.com/questions/7197181/jpa-unidirectional-many-to-one-and-cascading-delete
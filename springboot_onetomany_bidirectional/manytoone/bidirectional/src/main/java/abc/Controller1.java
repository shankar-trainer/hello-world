package abc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller1 {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    //@JsonIgnore
    @GetMapping("/addr")
    public List<Address> getAddress() {
        return addressRepository.findAll();
    }

    @PostMapping("/add")
    public Address addAddress(@RequestBody Address address) {
        for(Employee e:address.getEmpset())
            e.setAddress(address);

         return addressRepository.save(address);
    }

    //@JsonIgnore
    @GetMapping("/emp")
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }


}

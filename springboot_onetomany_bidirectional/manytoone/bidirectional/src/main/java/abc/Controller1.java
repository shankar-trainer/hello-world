package abc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Address> getAddress(){
        return addressRepository.findAll();
    }

    //@JsonIgnore
    @GetMapping("/emp")
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }


}

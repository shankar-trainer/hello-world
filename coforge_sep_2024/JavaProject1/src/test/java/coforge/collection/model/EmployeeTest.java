package coforge.collection.model;

import com.coforge.collection.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    Employee employee1,employee2;

    @BeforeEach
    public void init(){
        employee1=new Employee();
        employee1.setId(10001);
        employee1.setName("suraj partap");
        employee1.setSalary(30000);

        employee2=new Employee();
        employee2.setId(10001);
        employee2.setName("suraj partap");
        employee2.setSalary(30000);
    }
    @Test
    void testEmployeeObject(){
        Assertions.assertNotNull(employee2);
        Assertions.assertNotNull(employee1);

        Assertions.assertEquals(employee1,employee2);

        Assertions.assertEquals(employee1.getId(),employee2.getId());
        Assertions.assertEquals(employee1.getName(),"suraj partap");
        Assertions.assertEquals(employee1.getSalary(),30000);
    }
    @AfterEach
    void destroy(){
        employee1=null;
        employee2=null;
    }
}

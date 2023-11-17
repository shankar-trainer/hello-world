package ex1.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Employee.class);
        
        ApplicationContext ctx_home = new AnnotationConfigApplicationContext(HomeAddress.class);
        ApplicationContext ctx_office = new AnnotationConfigApplicationContext(OfficeAddress.class);
        
        Employee employee = ctx.getBean(Employee.class);
        
        employee.setAddress(ctx_home.getBean(HomeAddress.class));
        employee.getAddress().addressDetail();
        
        employee.setAddress(ctx_office.getBean(OfficeAddress.class));
        employee.getAddress().addressDetail();
        
        
    }
}
public class Employee {

    int id; // instance variable -- state, property
    String name;
    float salary;

    // all instance variable are initialized with 0 and null

    public static void main(String[] args) {
        Employee employee1; // refers null

        employee1=new Employee();
        // object created in heap and return reference/address to the reference variable
       // one object one reference variable

        System.out.println(employee1.id);
        System.out.println(employee1.name);
        System.out.println(employee1.salary);

        employee1.id=98988;
        employee1.name="amit kumar";
        employee1.salary=56000.00f;

        System.out.println(employee1.id);
        System.out.println(employee1.name);
        System.out.println(employee1.salary);



    }


}

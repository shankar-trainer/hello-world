
public class Employee {

    int id; // attributes,state  or instance variable
    String name;
    float salary;

    void work() {// behaviour or instance method
        System.out.println("employee work in office");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();// one reference variable , one object
        Employee emp2 = new Employee();
        // each object  is having one copy of attributes and behaviour
        //object can access attributes and behaviour using dot(.) operator
        // while  object creation, it initializes each instance with zero and null values

        System.out.println("Employee1 Information ");
        System.out.println("\tid is " + emp1.id);
        System.out.println("\tname is " + emp1.name);
        System.out.println("\tsalary is " + emp1.salary);

         emp2.id=87767687;
         emp2.name="mohan kumar";
         emp2.salary=89000;

        System.out.println("\nEmployee2 Information ");
        System.out.println("\tid is " + emp2.id);
        System.out.println("\tname is " + emp2.name);
        System.out.println("\tsalary is " + emp2.salary);

        emp1.work();
        emp2.work();
    }
}

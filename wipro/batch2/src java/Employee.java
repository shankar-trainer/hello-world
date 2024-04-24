public class Employee {

    int id; // id,name,salary is instance variable
    String name;// id,name,salary is associated with each instance, object
    float salary;

    // instance method
    void officeWork(){
        System.out.println("work in office");
    }

    public static void main(String[] args) {
        Employee emp1=new Employee();  // emp1 has one copy of id,name,salary, officeWork()
        Employee emp2=new Employee();// emp2 has one separate  copy of id,name,salary, officeWork()

        System.out.println("Employee1 Data ");
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
        emp1.officeWork();

        emp2.id=87788778;
        emp2.name="suresh kumar";
        emp2.salary=68000;

        System.out.println("Employee2 Data ");
        System.out.println(emp2.id);
        System.out.println(emp2.name);
        System.out.println(emp2.salary);
        emp2.officeWork();
    }
}

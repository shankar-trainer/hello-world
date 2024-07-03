// parent class
public class Employee {
    int id;
    String name;
    float salary;

    void employeeInfo() {
        System.out.println("employee Information ");
        System.out.println("\tId "+id);
        System.out.println("\tname "+name);
        System.out.println("\tsalary "+salary);
    }
}
// child class
class Manager extends  Employee{
    String location;
    int age;
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.id=1001;
        manager.name="sumit kumar";
        manager.salary=90000;
        manager.location="greater noida";
        manager.age=45;
        manager.employeeInfo();
        System.out.println("\tage is "+manager.age);
        System.out.println("\tlocation is "+manager.location);
    }
}

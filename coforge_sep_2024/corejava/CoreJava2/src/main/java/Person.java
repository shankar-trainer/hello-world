public class Person {

    protected int personId;
    protected  String  personName;
    protected  float personSalary;

    void personInfo(){
        System.out.println("Person data ");
        System.out.println("\tId "+personId);
        System.out.println("\tName "+personName);
        System.out.println("\tSalary "+personSalary);
    }
}
// child class
class  Employee extends  Person {
// Employee is a Person -- is a relationship

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.personName="amit kumar";
        employee.personSalary=45000.56f;
        employee.personId=10001;

        employee.personInfo();
    }
}
//Person is Parent/Base class
//Employee is child/derived class

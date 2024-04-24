public class Customer {

    int id;
    String name;
    float salary;

    public   Customer() {
        System.out.println("default constructor");
       id=10001;
       name="suresh kumar";
       salary=26000;
    }

    public Customer(int id, String name, float salary) {
        System.out.println("overloaded constructor");
        this.id = id;   //  this is current class reference variable
        this.name = name;
        this.salary = salary;
    }

    void customerInfo(){
        System.out.println("\tid is "+id);
        System.out.println("\tname is "+name);
        System.out.println("\tsalary is "+salary);
    }
    public static void main(String[] args) {
        Customer customer1=new Customer();
        Customer customer2=new Customer(878787,"amit kumar",56000);
        Customer customer3=new Customer(456565,"lallan sharma",67000);

        System.out.println("Customer1 Information");
        customer1.customerInfo();

        System.out.println("\nCustomer2 Information");
        customer2.customerInfo();

        System.out.println("\nCustomer3 Information");
        customer3.customerInfo();
    }
}

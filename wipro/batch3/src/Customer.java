
public class Customer {
    long customerId;
    String customerName;
    String customerLocation;
    int customerAge;

    // if no constructor added, then compiler adds default constructor in .class file and initializes each instance variable with zero and null
    //  default constructor , it initializes each instance variable with other than default values
    // default constructor initializes each object with same values

    public Customer() {
        System.out.println("default constructor ");
        customerAge = 45;
        customerName = "ram kumar";
        customerLocation = "chennai";
        customerId = 7667767;
    }
    //overloaded constructor
    // overloaded constructor initializes each object with different values

    public Customer(long customerId, String customerName, String customerLocation, int customerAge) {
        System.out.println("overloaded constructor");
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLocation = customerLocation;
        this.customerAge = customerAge;
    }

    public void customerInfo() {
        System.out.println("\tId :" + customerId);
        System.out.println("\tName :" + customerName);
        System.out.println("\tLocation :" + customerLocation);
        System.out.println("\tAge :" + customerAge);
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        System.out.println("customer1 information");
        customer1.customerInfo();
        System.out.println("customer2 information");
        customer2.customerInfo();
        System.out.println("customer3 information");
        customer3.customerInfo();
    }
}

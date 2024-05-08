public class CustomerMain {
    public static void main(String[] args) {

        Customer customer[] = new Customer[4];

        int ids[] = {10001, 10002, 10003, 10004};
        String nm[] = {"ram kumar", "mahesh kumar", "pawan kumar", "amitabh kumar"};
        int age[] = {23, 34, 55, 61};
        String location[] = {"new delhi", "noida", "gurgaon", "mathura"};

        Customer customer1=new Customer();
        for (int i = 0; i <customer.length; i++) {
            customer[i]=new Customer(ids[i],nm[i],location[i],age[i] );
        }

        customer1.customerInfo();

        for (Customer c:customer)
            c.customerInfo();
    }
}

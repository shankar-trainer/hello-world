package com.wipro.inheritance;

class Address {
    int addrId;
    String city;
}

//super class
public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerLocation;

    public Customer(int customerId, String customerName, String customerLocation) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLocation = customerLocation;
    }

//    public Customer() {
//    }
}

// subclass
//class UrbanCustomer extends  Customer,Address{// error  can not extend multiple  class
class UrbanCustomer extends Customer {
    //  public UrbanCustomer(){
//      super();
//  }
    protected String city;
    protected String country;

    public UrbanCustomer(int customerId, String customerName, String customerLocation, String city, String country) {
        super(customerId, customerName, customerLocation); //super() -- calls super class this()-- calls current class constructor
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args) {
        UrbanCustomer customer = new UrbanCustomer(6767676, "amit kumar", "sector62 ", "Noida", "india");

        System.out.println("Customer Details ");
        System.out.println("\tId " + customer.customerId);
        System.out.println("\tName " + customer.customerName);
        System.out.println("\tLocation " + customer.customerLocation);
        System.out.println("\tCity " + customer.city);
        System.out.println("\tCountry " + customer.country);
    }
}

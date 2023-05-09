package org.example;

public class Employee {
    private int id;
    private String name;

    private float salary;
    private Address address;

    public float getSalary() {
        return salary;
    }

    public void startup(){
        System.out.println("start up method called");
         this.id=888888;
         this.name="amit kumar";
         this.salary=45000;
          this.address.setAddrId(9090);
          this.address.setCity("mumbai");
          this.address.setState("maharastra");

    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

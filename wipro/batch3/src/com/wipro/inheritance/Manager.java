package com.wipro.inheritance;

class Manager extends  Employee{
// Manager is  Employee
// sub class is created with extends keyword
// inheritance provides code reusability

    private float pf;
    private float hra;
    private String location;

    public float getPf() {
        return pf;
    }

    public void setPf(float pf) {
        this.pf = pf;
    }

    public float getHra() {
        return hra;
    }

    public void setHra(float hra) {
        this.hra = hra;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float mySalary(){
        return  super.getSalary();
    }
    @Override
    public float getSalary() {
        return super.getSalary()+(super.getSalary()*getHra())-(super.getSalary()*getPf());
    }

    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setId(1001);
        manager.setName("amit kumar");
        manager.setSalary(45000);
        manager.setHra(10/100.0f);
        manager.setPf(5/100.0f);
        manager.setLocation("chennai");

        System.out.println("manager data ");
        System.out.println("\t id is "+ manager.getId());
        System.out.println("\t name is "+ manager.getName());
        System.out.println("\t actual salary is "+ manager.mySalary());
        System.out.println("\t gross salary is "+ manager.getSalary());
        System.out.println("\t pf % is "+ manager.getPf());
        System.out.println("\t hra % is "+ manager.getHra());
        System.out.println("\t location is "+ manager.getLocation());
    }
}
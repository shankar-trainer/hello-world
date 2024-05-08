package com.wipro.inheritance;

public class Person {
    void info(){
        System.out.println("i am person");
    }
}
class BankEmployee extends  Person{
    @Override
    void info() {
        System.out.println("i am bank employee");
    }
}
class Passenger extends  Person{
    @Override
    void info() {
        System.out.println("i am passenger");
    }
}
class Father extends  Person{
    @Override
    void info() {
        System.out.println("i am father");
    }
}
class PersonMain{
    public static void main(String[] args) {
        Person p;
        p=new BankEmployee();
        p.info();

        p=new Father();
        p.info();

        p=new Passenger();
        p.info();
    }
}
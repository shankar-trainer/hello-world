package com.wipro.inheritance;
class X{
    int p=10; // super class variable
 }

public class Z  extends X{
    int p=100; // instance variable
 void disp(){
     int p=1000; // local variable
     System.out.println("local  p is "+p);
     System.out.println("current class  p is "+this.p);
     System.out.println("super class  p is "+super.p);
 }

    public static void main(String[] args) {
        new Z().disp();
    }
}

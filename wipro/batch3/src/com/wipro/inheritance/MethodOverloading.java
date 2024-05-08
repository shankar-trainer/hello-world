package com.wipro.inheritance;

public class MethodOverloading {
    int addition(int a, int b) {
        return a + b;
    }

    float addition(float a, float b) {
        return a + b;
    }

    String addition(String a, String b) {
//        return a +" " + b;
        return a .concat("  ").concat(b);
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading overloading=new MethodOverloading();
        int a=10;
        int b=20;
        int c=30;
        float x=34.56f;
        float y=56.78f;

        String fname="ramesh";
        String lname="sharma";
        System.out.println("addition of two  integer is  "+overloading.addition(a,b));
        System.out.println("addition of three  integer is  "+overloading.addition(a,b,c));
        System.out.println("addition of two decimal is  "+overloading.addition(x,y));
        System.out.println("addition of first and last name is  "+overloading.addition(fname,lname));

    }

}

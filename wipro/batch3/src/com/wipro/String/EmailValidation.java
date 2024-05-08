package com.wipro.String;

public class EmailValidation {
    public static void main(String[] args) {

        String email="wipro_ramkumar@wipromail.com";

        if(!email.startsWith("wipro"))
            System.out.println("invalid email does not starts with wipro");
        else if(!email.endsWith(".com"))
            System.out.println("invalid email does not ends  with .com");
        else if(!email.contains("@"))
            System.out.println("invalid email does not have @ sign");
        else
            System.out.println(email+" is valid ");

        String name=" ram kumar  ";
        System.out.println(name+"  length "+name.length());
        System.out.println(name+"  length "+name.trim().length());
        String name1=name.trim();
        System.out.println(name1);
        System.out.println(name1.length());

    }
}

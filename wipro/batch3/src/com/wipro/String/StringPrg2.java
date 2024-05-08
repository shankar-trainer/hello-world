package com.wipro.String;

public class StringPrg2 {
    public static void main(String[] args) {
        String var1="hello";
        String var2="hello";

        // var1, var2 refers the same object present inside string pool
        // two references, one object

        String var3=new String("hello");
        // var3 will create new String object outside string pool
        // three references two objects

        // ==    double equals checks references

        System.out.println(var1==var2);// true
        System.out.println(var1==var3);// false

        //.equals -- checks content not references
        System.out.println(var1.equals(var2));

    }
}

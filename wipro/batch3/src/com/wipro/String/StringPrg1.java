package com.wipro.String;

public class StringPrg1 {

    public static void main(String[] args) {
        String  var1="hello";
        System.out.println(var1);
        var1.concat(" world");
        System.out.println(var1);

        // all methods in string class does not changes the content
        // instead it returns changed values

        System.out.println( var1.concat(" world"));
        String concat = var1.concat(" world");
        System.out.println(var1.toUpperCase());
    }
}

package com.wipro.String;

public class StringPrg6 {

    public static void main(String[] args) {
        System.out.println("ram kumar".equals("Ram Kumar"));
        System.out.println("ram kumar".equalsIgnoreCase("Ram Kumar"));
        System.out.println("wipro_emp_ramkumar".startsWith("wipro"));
        System.out.println("wipro_emp_ramkumar".startsWith("hello"));
        System.out.println("wipro_emp_ramkumar@wipro.com".endsWith(".com"));

        System.out.println("i am mohan kumar".contains("mohan"));
        String var1="we all are indian";
        int indian = var1.indexOf("indian");
        if(indian>=0)
            System.out.println("found at "+indian);
        else System.out.println("not found");

        var1="we all are indian.we learn java";
        System.out.println(var1.indexOf("we"));
        System.out.println(var1.lastIndexOf("we"));
        System.out.println(var1.indexOf("learn",18));
        System.out.println(var1.indexOf('d'));

        System.out.println("delhi".compareTo("delhi"));
        System.out.println("delhi".compareTo("delii"));
        System.out.println("delhi".compareTo("delgi"));
        System.out.println("delhi".compareTo("delei"));

        System.out.println("we are learning java".substring(4,10));
        System.out.println("we are learning java".replace('e','z'));
        System.out.println("we are learning java".replaceAll("java","python"));
    }
}

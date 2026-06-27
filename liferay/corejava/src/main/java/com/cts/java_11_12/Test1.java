package com.cts.java_11_12;

public class Test1 {

    public static void main(String[] args) {
        String s = "";
        String s1 = "  ";

        System.out.println(s.isEmpty());
        System.out.println(s1.isEmpty());

        System.out.println(s.isBlank());
        System.out.println(s1.isBlank());

        var a = "hello";
        var b = 123;

        System.out.println(a.charAt(2));
        System.out.println(b);

//        StringBuffer stringBuffer=new StringBuffer("abcd");
        var stringBuffer = new StringBuffer("abcd");
        var emp1 = new Employee();

        var s11 = "we\nare\nlearning\njava";

        s11.lines().forEach(System.out::println);

        var d="hello  ";
        String repeat = d.repeat(10);
        System.out.println(repeat);

        String  s111= """                
          void main()
        {
            printf("hello world");
        }
        """;
        System.out.println(s111);

    }
}

class Employee {

}

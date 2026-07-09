package com.coforge.java8.lambda;

@FunctionalInterface
interface hello {
    void display(String s);
}

interface Addition {
    int sum(int a, int b);
}

public class Example1 {
// hello hello1=new hello() {
//     @Override
//     public void display(String s) {
//         System.out.println("hello world "+s);
//     }
// };

    hello hello2 = (a) -> System.out.println("welcome to " + a);

    public static void main(String[] args) {
//        new Example1().hello1.display("suresh ");
        new Example1().hello2.display("suresh ");
        Addition addition = (x, y) -> x + y;
        System.out.println("sum is " + addition.sum(11, 22));
    }
}

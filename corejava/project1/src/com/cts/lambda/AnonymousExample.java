package com.cts.lambda;
@FunctionalInterface
interface Hello{
    void display(String s);
//    void display1(String s);
}
// interface having single method is used in lambda expression
// interface having single method called as functional interface

public class AnonymousExample {
// Anonymous inner class
// private  Hello hello=new Hello() {
//        @Override
//        public void display(String s) {
//            System.out.println("welcome "+s);
//        }
//    };
Hello  hello1=(s)-> System.out.println("greeting "+s);
    public static void main(String[] args) {
//        new AnonymousExample().hello.display("suresh kumar");
        new AnonymousExample().hello1.display("anand kumar");
    }

}

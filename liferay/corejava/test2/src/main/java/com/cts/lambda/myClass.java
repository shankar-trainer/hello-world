package com.cts.lambda;

interface Hello{
    void show();
    void welcome();
}
public class myClass {

    Hello hello=new Hello() {
        @Override
        public void show() {
            System.out.println("hello world");
        }

        @Override
        public void welcome() {
            System.out.println("welcome");
        }
    };

    public static void main(String[] args) {
        myClass aClass=new myClass();
        aClass.hello.show();
        aClass.hello.welcome();
    }
}

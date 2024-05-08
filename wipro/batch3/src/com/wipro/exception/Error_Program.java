package com.wipro.exception;

public class Error_Program {
//Error e;
    void hello(){
        hello();//StackOverflowError
    }

    public static void main(String[] args) {
        new Error_Program().hello();
    }
}

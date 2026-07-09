package com.coforge.exception;
import static java.lang.System.out;
import static java.lang.Math.PI;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("hello world ");
        out.println("hello world ");
        out.println(Math.PI);   // static import -- import static method, attributes
        out.println(PI);
    }
}/*
java.lang.System
  public static final java.io.PrintStream out

java.io

public class PrintStream
  public void println()
*/

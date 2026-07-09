package com.coforge.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test11{

    int  addition(int a, int b) throws IOException  {
        return  a+b;
    }
  } // in overriding checked exception can be narrower or same

public class Test3 extends  Test11 {
    @Override
//    int  addition(int a, int b) throws Exception {
//    int  addition(int a, int b) throws IOException {
    int  addition(int a, int b) throws FileNotFoundException {
//    int  addition(int a, int b) throws ArithmeticException {
        return (a+b+10);
    }
}

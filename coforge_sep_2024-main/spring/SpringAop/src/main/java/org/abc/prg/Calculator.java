package org.abc.prg;

public class Calculator {

    public int addition(int a, int b){
        return  a+b;
    }

    public int division(int a, int b) throws Exception {
        if(b==0)
            throw new Exception("divided by zero");
        return  a/b;
    }

}

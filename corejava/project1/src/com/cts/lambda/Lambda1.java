package com.cts.lambda;

interface Addition{
    float sum(float a, float b);
}
public class Lambda1 {

//    Addition addition=(x,y)->{return x+y};
//    Addition addition=(x,y)->x+y;

    public static void main(String[] args) {
        Addition addition=(x,y)->x+y;
        System.out.println("addition is "+addition.sum(11.2f,22.5f));
    }

}

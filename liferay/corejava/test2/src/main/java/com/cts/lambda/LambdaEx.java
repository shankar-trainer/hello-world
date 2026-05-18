package com.cts.lambda;

import java.util.Comparator;

@FunctionalInterface
interface addition{
    int sum(int a, int b);
}
public class LambdaEx {
//addition addition1=new addition() {
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//   };

   addition addition2=(x,y)->x+y;

    public static void main(String[] args) {
        LambdaEx lambdaEx=new LambdaEx();
        System.out.println(lambdaEx.addition2.sum(11,22));
        Comparable c;

        String s;
        Comparator comparator;
    }
}

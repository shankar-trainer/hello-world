package com.coforge.model;

import java.util.Scanner;

public interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator  implements  AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int s=0;
        if(n>1000)
            System.exit(1);
        else {
            for (int i = 1; i <=n ; i++) {
                if(n%i==0)
                    s=s+i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        MyCalculator advancedArithmetic=new MyCalculator();
        int p=new Scanner(System.in).nextInt();
        System.out.println("I implemented "+advancedArithmetic.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(advancedArithmetic.divisor_sum(p));
    }
}
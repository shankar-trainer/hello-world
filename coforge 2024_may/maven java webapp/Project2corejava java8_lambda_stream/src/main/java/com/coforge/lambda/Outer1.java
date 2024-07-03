package com.coforge.lambda;

interface Calculation{
    void addition(int a, int b);
    void subtraction(int a, int b);
}

public class Outer1 {
private Calculation calculation=new Calculation() {
        int p;
        @Override
        public void addition(int a, int b) {
            System.out.println("addition is "+(a+b));
        }

        @Override
        public void subtraction(int a, int b) {
            System.out.println("subtraction is "+(a-b));
        }
    };

    public static void main(String[] args) {
        Outer1 outer1=new Outer1();
        outer1.calculation.addition(11,22);
        outer1.calculation.subtraction(110,22);
    }

}

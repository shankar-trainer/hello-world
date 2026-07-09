package com.coforge.collection;

interface Calculation{
    int addition(int a, int b);
    int subtraction(int a, int b);
}

public class AnonymousInner {
 int ar[]={};
 int ar1[]=new int[]{} ;// anonymous array

    Calculation calculation=new Calculation() {
        @Override
        public int addition(int a, int b) {
            return 0;
        }

        @Override
        public int subtraction(int a, int b) {
            return 0;
        }
    };

}

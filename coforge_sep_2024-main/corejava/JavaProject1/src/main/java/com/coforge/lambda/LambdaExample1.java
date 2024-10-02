package com.coforge.lambda;

@FunctionalInterface
interface  Addition{
    int add(int a, int b);
}
// interface having single method -- functional interface
// functional interface is used for lambda expression

public class LambdaExample1 {

   /* Addition addition=new Addition() {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
    };*/

    Addition addition1=(x,y)->x+y;

    public static void main(String[] args) {
        Addition addition2=(x,y)->x+y;
        System.out.println(addition2.add(11,12));
    }

}

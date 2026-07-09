package com.coforge.exception;

public class VarArgs1 {

    static void display(int x, int y, int...z){
        System.out.println("var args");
        System.out.println(x);
        System.out.println(y);

        System.out.println(z[0]);
        System.out.println(z[1]);
        for (int i:z) {
            System.out.print(i+",  ");
        }
    }

    public static void main(String ...args) {
//        display(1,2,3);
        display(1,2,3,4);
        display(1,2,3,4,5);

        display(1,2, new int[]{1,2,3,4});
        int ar1[]={1,2};
        display(1,2, ar1);
    }

}

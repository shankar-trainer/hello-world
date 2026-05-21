package cts.com.exception;

public class ExceptionPrg1 {


    public static void main(String[] args) {
        System.out.println("start of the program");

        System.out.println(10.0/0);
        System.out.println(10.0F/0);
        System.out.println(-10.0F/0);

//        System.out.println(10/0);// ArithmaticException

        int ar[]={1,2,3};

       // System.out.println(ar[3]);//  ArrayIndexOutOfBoundsException a;

        String s1="abc";
        System.out.println(s1.charAt(3));//      StringIndexOutOfBoundsException s;

        Integer  x=0;
        int p=x.intValue();

        Integer x1=null;//
        //x1.toString();// NullPointerException

        int p2=Integer.parseInt("123abc");//NumberFormatException

        System.out.println("end  of the program");
    }

}

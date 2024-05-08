package com.wipro.String;

public class StringReverse {
    static String reverse(String s){
        char ar[]=new char[s.length()];
        int k=0;
        for (int i = ar.length-1; i >=0 ; i--) {
            ar[i]=s.charAt(k++);
        }
        return new String(ar);
    }

    public static void main(String[] args) {
        System.out.println("hello reverse is "+reverse("hello"));
    }
}

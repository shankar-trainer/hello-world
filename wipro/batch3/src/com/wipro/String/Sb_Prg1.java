package com.wipro.String;

public class Sb_Prg1 {
    public static void main(String[] args) {
        String s1="hello";
        System.out.println(s1);
        s1.concat(" world");
        System.out.println(s1);

        //StringBuffer buffer="hello";
        // StringBuffer is modifiable/mutable
        // StringBuffer values can be changed
        //StringBuffer does not accepts  string literal

        // extra methods like insert , reverse, delete, append  and all same methods as of String class
        StringBuffer buffer=new StringBuffer("welcome");
        System.out.println(buffer);
        buffer.append(" to java");
        System.out.println(buffer);

        buffer.reverse();
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        buffer.insert(8," and greeting ");
        System.out.println(buffer);
        buffer.delete(8,22);
        System.out.println(buffer);
    }
}

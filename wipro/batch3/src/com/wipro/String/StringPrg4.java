package com.wipro.String;

public class StringPrg4 {
    public static void main(String[] args) {

         String s1="we-are-learning-java.we have learned&pseudocode algorithm@and flowchart ";

        String split[] = s1.split(" |&|@|-");// with multiple  separator/delimiter(-&@ space)

        for (String s : split)
            System.out.print(s + ", ");
    }
}

package com.abc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateProgram1 {
    public static void main(String[] args) {


        Date date=new Date();
        System.out.println(date);

        Date date1=new Date(1000);//argument is no of milli seconds
        System.out.println(date1);

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter date in dd-MM-yyyy format");
        String s=sc.next();
        try {
            Date parse = dateFormat.parse(s);
            System.out.println(parse);
            java.sql.Date date2=new java.sql.Date(parse.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}

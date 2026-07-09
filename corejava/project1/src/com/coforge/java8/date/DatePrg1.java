package com.coforge.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatePrg1 {

    public static void main(String[] args) {

        // java7 date
        /*
         it is mutable
         date is both date and time
         */

        Date date1 = new Date();
        System.out.println(date1);
        date1 = new Date(1000);
        System.out.println(date1);

        /*
        java 8 date
          separate class for date and time
          all are immutable
         */
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //localDate=new LocalDate(); // error
        LocalDate localDate1 = LocalDate.of(2022, 11, 23);

        System.out.println(localDate1);

        localDate1.plusDays(12);
        localDate1.plusMonths(1);
        System.out.println(localDate1); // same value

        LocalDate localDate2 = localDate1.plusDays(12);
        LocalDate localDate3 = localDate2.plusMonths(1);
        System.out.println(localDate2);
        System.out.println(localDate3);

        LocalTime localTime=LocalTime.now();
        LocalTime localTime1=LocalTime.MAX;
        LocalTime localTime2=LocalTime.of(11,22);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);


    }

}

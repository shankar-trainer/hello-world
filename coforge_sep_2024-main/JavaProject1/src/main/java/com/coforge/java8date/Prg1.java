package com.coforge.java8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Prg1 {

    public static void main(String[] args) {

        Date date=new Date();
        System.out.println(date);
        date=new Date(1);
        System.out.println(date);

        // java7 date is mutable and combination of both date +time

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalDate  localDate1=LocalDate.of(2022,12,23);
        System.out.println(localDate1);

        LocalTime localTime1=LocalTime.of(12,33,45);
        System.out.println(localTime1);

        localDate1.plusDays(10);
        localDate1.plusMonths(12);
        localDate1.plusYears(3);
        localDate1.minusYears(3);

        localTime1.plusHours(12);
        localTime1.plusMinutes(33);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        //2022-12-23  yyyy-MM-dd
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s1 = localDate1.format(dateTimeFormatter);
        System.out.println("formated date (dd-MM-yyyy) "+s1);

        System.out.println(localDate1.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        System.out.println(localDate1.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
        System.out.println(localDate1.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEE")));
        System.out.println(localDate1.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE")));

        System.out.println(localTime1.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));


    }
}

package com.cts.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date1 {

    public static void main(String[] args) {
// java 7 dates mutable, Date -- both date n time
        Date date = new Date();
        System.out.println(date);

        date = new Date(1000);
        System.out.println(date);
        // java 8 Date n time, immutable, separate Date n time class  LocalDate, LocalTime, LocalDateTime

        // LocalDate localDate=new LocalDate(); // error
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2022, 12, 23);
        System.out.println(localDate1);

        LocalDate d1 = localDate1.plusDays(4545);
        System.out.println(localDate1);
        System.out.println(d1);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime t1 = localTime.plusHours(56);
        System.out.println(t1);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        localDateTime.plusMonths(56);
        localDateTime.plusHours(56);
    }
}

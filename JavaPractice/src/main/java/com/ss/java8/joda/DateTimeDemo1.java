package com.ss.java8.joda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DateTimeDemo1 {


    public static void main(String[] args) {

        LocalDate date= LocalDate.now();
        System.out.println(date);

        System.out.println(date.getDayOfWeek());

        date.getDayOfMonth();
        date.getMonthValue();
        date.getYear();
        date.getMonth().name();

        LocalTime time=LocalTime.now();
        System.out.println(time);

        Period p=Period.of(0,0,0);
        System.out.println(p);


        LocalTime time1 = LocalTime.of(16, 40);
        String amPm = time1.getHour() >= 12 ? (time1.getHour() == 12) ? "PM" : "AM":"CM";
        System.out.println(amPm);

    }
}

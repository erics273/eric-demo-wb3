package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeStuff {

    public static void main(String[] args) {

        //get the date right now
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        //print out the date pieces
        System.out.println("Day of Week: " + date1.getDayOfWeek());
        System.out.println("Day of Month: " + date1.getDayOfMonth());
        System.out.println("Day of Year: " + date1.getDayOfYear());
        System.out.println("Month Name: " + date1.getMonth());
        System.out.println("Month Value: " + date1.getMonthValue());
        System.out.println("Year: " + date1.getYear());

        //get the time right now
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());
        System.out.println("Nanosecond: " + time1.getNano());


        //get the date and time right now
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattedDate = dateTime1.format(dateTimeFormat);
        System.out.println(formattedDate);


    }

}

package com.vijay.date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
    	String date1 = "2023-11-14";
        String date2 = "2025-05-20";

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        long daysBetween = Math.abs(ChronoUnit.DAYS.between(d1, d2));

        System.out.println("Difference is " + daysBetween + " days");
       
    }
}

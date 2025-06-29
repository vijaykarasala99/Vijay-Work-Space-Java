package com.vijay.date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

public class DateWeekFinding {
    public static void main(String[] args) {
        // Get current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
      
        //Get current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Date: " + currentTime);
        
        // Get current day of the week
        DayOfWeek dayOfWeek =  LocalDate.now().getDayOfWeek();
        System.out.println("Today is: " + dayOfWeek);
    }
}

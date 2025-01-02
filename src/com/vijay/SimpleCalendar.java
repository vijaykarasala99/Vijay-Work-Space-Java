package com.vijay;

public class SimpleCalendar {

    public static void main(String[] args) {
        int day = 1;      // Tracks the day count
        int date = 1;     // Tracks the current date
        String month = "January"; // Tracks the current month
        int year = 2024;  // Tracks the current year

        while (day <= 72) { // Loop until 72 days are printed
            // Print the current day, date, month, and year
            System.out.println("Day: " + day + ", Date: " + date + " " + month + " " + year);

            // Increment the day and date
            day++;
            date++;

            // Handle month transitions
            if (month.equals("February")) {
                // Leap year check for February
                if (isLeapYear(year) && date > 29) {
                    date = 1;
                    month = "March";
                } else if (!isLeapYear(year) && date > 28) {
                    date = 1;
                    month = "March";
                }
            } else if ((month.equals("April") || month.equals("June") || 
                        month.equals("September") || month.equals("November")) && date > 30) {
                // Months with 30 days
                date = 1;
                month = getNextMonth(month);
            } else if (date > 31) {
                // Months with 31 days
                date = 1;
                month = getNextMonth(month);

                // Increment year if transitioning from December to January
                if (month.equals("January")) {
                    year++;
                }
            }
        }
    }

    // Leap year checker logic
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get the next month logic
    public static String getNextMonth(String currentMonth) {
        switch (currentMonth) {
            case "January": return "February";
            case "February": return "March";
            case "March": return "April";
            case "April": return "May";
            case "May": return "June";
            case "June": return "July";
            case "July": return "August";
            case "August": return "September";
            case "September": return "October";
            case "October": return "November";
            case "November": return "December";
            case "December": return "January";
            default: return ""; // Invalid month
        }
    }
}

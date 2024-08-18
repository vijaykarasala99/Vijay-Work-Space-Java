package com.vijay.exceptions;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0;                 // This will cause ArithmeticException
            System.out.println(numbers[5]);      // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Specific Exception Caught: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // This block handles any other exceptions that are not specifically caught above
            System.out.println("General Exception Caught: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Cleanup or additional code executed here.");
        }
    }
}

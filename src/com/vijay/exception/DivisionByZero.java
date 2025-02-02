package com.vijay.exception;
public class DivisionByZero {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed." +e.getMessage());
        }
    }
}

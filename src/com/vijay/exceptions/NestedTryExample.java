package com.vijay.exceptions;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                int a = 10 / 0; // ❌ ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }

            String s = null;
            System.out.println(s.length()); // ❌ NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}

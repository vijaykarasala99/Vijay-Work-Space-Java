package com.vijay.ait;

public class FactorialRange {
    public static void main(String[] args) {
        int start = 1, end = 5;
        for (int i = start; i <= end; i++) {
            System.out.println("Factorial of " + i + " is: " + factorial(i));
        }
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

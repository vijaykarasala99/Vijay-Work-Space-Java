package com.vijay.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits: " + sumDigits(num));
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        return n % 10 + sumDigits(n / 10);  // Recursive call
    }
}

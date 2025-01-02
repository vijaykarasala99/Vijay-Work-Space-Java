package com.vijay.recursion;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number of digits: " + countDigits(num));
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 0;  // Base case
        }
        return 1 + countDigits(num / 10);  // Recursive call
    }
}


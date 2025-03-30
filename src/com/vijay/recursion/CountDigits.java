package com.vijay.recursion;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number of digits: " + countDigits(num));
    }

    public static int countDigits(int num) {
    	 if (num < 10) { // Base case (covers 0 and single-digit numbers)
             return 1;
         }
         return 1 + countDigits(num / 10); // Recursive call
    }
}


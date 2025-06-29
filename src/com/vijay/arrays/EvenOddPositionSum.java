package com.vijay.arrays;

public class EvenOddPositionSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // Even index
                evenSum += arr[i];
            } else { // Odd index
                oddSum += arr[i];
            }
        }

        System.out.println("Even position sum = " + evenSum);
        System.out.println("Odd position sum = " + oddSum);
    }
}

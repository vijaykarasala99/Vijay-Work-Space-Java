package com.vijay.ait;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 5, 63, 78, 99};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;
        System.out.println("Average of array elements: " + average);
    }
}

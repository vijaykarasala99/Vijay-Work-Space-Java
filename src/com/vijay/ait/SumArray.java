package com.vijay.ait;
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 5, 63, 78, 99};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}

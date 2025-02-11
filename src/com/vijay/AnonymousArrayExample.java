package com.vijay;
public class AnonymousArrayExample {
    public static void main(String[] args) {
        // Anonymous array passed directly to a method
        sum(new int[]{1, 2, 3, 4, 5});
    }

    public static void sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        System.out.println("Sum: " + total);
    }
}

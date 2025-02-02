package com.vijay.arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 2, 6};
        int target = 2;
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        // Loop to find first and last occurrence
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i; // Set first occurrence
                }
                lastOccurrence = i; // Update last occurrence
            }
        }
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
            System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

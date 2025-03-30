package com.vijay.arrays;

import java.util.Arrays;

public class BinarySearchReturnCases {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        //Formula: -(Insertion Point + 1)
        
        // Case 1: Target is greater than the largest element
        int index1 = Arrays.binarySearch(numbers, 50);
        // Insertion Point = 4 (50 should be inserted at the end)
        // Formula: Return value = -(Insertion Point + 1) = -(4 + 1) = -5
        System.out.println("Index of 50: " + index1); // Output: -5

        // Case 2: Target is smaller than the smallest element
        int index2 = Arrays.binarySearch(numbers, 5);
        // Insertion Point = 0 (5 should be inserted at the beginning)
        // Formula: Return value = -(Insertion Point + 1) = -(0 + 1) = -1
        System.out.println("Index of 5: " + index2); // Output: -1
    }
}
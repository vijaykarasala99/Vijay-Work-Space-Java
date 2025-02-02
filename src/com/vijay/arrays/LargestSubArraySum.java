package com.vijay.arrays;

public class LargestSubArraySum {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : array) {
            currentSum += num; // Add the current number to the current sum
            if (currentSum > maxSum) {
                maxSum = currentSum; // Update max sum if current sum is greater
            }
            if (currentSum < 0) {
                currentSum = 0; // Reset current sum if it becomes negative
            }
        }

        System.out.println("Largest sum of subarray: " + maxSum);
    }
}

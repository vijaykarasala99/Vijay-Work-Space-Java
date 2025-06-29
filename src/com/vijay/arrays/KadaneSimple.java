package com.vijay.arrays;

public class KadaneSimple {
	
	public static void main(String[] args) {
//To find the maximum sum of a contiguous subarray using Kadane’s Algorithm in O(n) time complexity.
		
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = arr[0], currentSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println("Maximum Subarray Sum: " + maxSum);
	}
}

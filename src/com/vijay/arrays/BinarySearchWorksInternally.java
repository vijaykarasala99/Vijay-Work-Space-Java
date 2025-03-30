package com.vijay.arrays;

public class BinarySearchWorksInternally {
	// Binary search halves a sorted array, comparing the target with the mid element until found.
	public static int binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2; // Prevents overflow

			if (arr[mid] == target)
				return mid; // Found element, return index

			if (arr[mid] < target)
				left = mid + 1; // Search right half
			else
				right = mid - 1; // Search left half
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 7, 9, 11, 15 };
		int target = 7;
		int index = binarySearch(numbers, target);
		System.out.println("Element found at index: " + index); // Output: 3
	}
}
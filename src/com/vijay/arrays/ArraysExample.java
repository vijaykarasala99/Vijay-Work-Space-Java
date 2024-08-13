package com.vijay.arrays;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		// Initialize an array
		int[] numbers = { 40, 10, 50, 20, 30 };
     
		// 1. sort() - Sorts the array in ascending order
		Arrays.sort(numbers);
		System.out.println("Sorted array: " + Arrays.toString(numbers)); // [10, 20, 30, 40, 50]

		// 2. binarySearch() - Searches for a value in the sorted array
		int index = Arrays.binarySearch(numbers, 30);
		System.out.println("Index of 30: " + index); // 2

		// 3. fill() - Fills the array with a specific value
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 100);
		System.out.println("Filled array: " + Arrays.toString(filledArray)); // [100, 100, 100, 100, 100]

		// 4. copyOf() - Copies the array to a new array with the specified length
		int[] copiedArray = Arrays.copyOf(numbers, 7);
		System.out.println("Copied array: " + Arrays.toString(copiedArray)); // [10, 20, 30, 40, 50, 0, 0]

		// 5. copyOfRange() - Copies a range of the array to a new array
		int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
		System.out.println("Range copy: " + Arrays.toString(rangeCopy)); // [20, 30, 40]

		// 6. hashCode() - Returns the hash code of the array
		int hashCode = Arrays.hashCode(numbers);
		System.out.println("Hash code of array: " + hashCode); // Varies based on contents

		// 7. toString() - Returns the string representation of the array
		String arrayString = Arrays.toString(numbers);
		System.out.println("Array as String: " + arrayString); // [10, 20, 30, 40, 50]

		// 8. equals() - Compares two arrays for equality
		int[] anotherArray = { 10, 20, 30, 40, 50 };
		boolean areEqual = Arrays.equals(numbers, anotherArray);
		System.out.println("Arrays equal: " + areEqual); // true

		// 9. deepEquals() - Compares two multi-dimensional arrays for deep equality
		int[][] multiDimArray1 = { { 10, 20 }, { 30, 40 } };
		int[][] multiDimArray2 = { { 10, 20 }, { 30, 40 } };
		boolean areDeepEqual = Arrays.deepEquals(multiDimArray1, multiDimArray2);
		System.out.println("Multi-dimensional arrays deep equal: " + areDeepEqual); // true
	}
}

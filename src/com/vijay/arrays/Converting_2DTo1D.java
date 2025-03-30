package com.vijay.arrays;

import java.util.Arrays;

public class Converting_2DTo1D {

	public static void main(String[] args) {
		int[][] array = { { 1, 2 }, { 3, 4, 5 }, { 6 }, { 7, 8, 9, 10 } };

		// Step 1: Calculate total size(total columns)
		int totalSize = 0;
		for (int i = 0; i < array.length; i++) {
			totalSize += array[i].length;
		}

		System.out.println("Total size of array: " + totalSize);

		// Step 2: Flatten the array using for loop
		int[] oneDArray = new int[totalSize];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				oneDArray[k++] = array[i][j];
			}
		}
		System.out.println(Arrays.toString(oneDArray));
	}
}


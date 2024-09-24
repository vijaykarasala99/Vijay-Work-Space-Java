package com.vijay.arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 5 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		System.out.println("Given array Length: " + array.length); // return rows length: 4

		// below array.length is rows length, array[i].length is columns length
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Access element: " + array[0][3]);

		// Print the array using an enhanced for loop
		for (int[] k : array) {
			for (int element : k) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}

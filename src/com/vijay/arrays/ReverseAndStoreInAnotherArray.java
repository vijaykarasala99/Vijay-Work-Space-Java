package com.vijay.arrays;

import java.util.Arrays;

public class ReverseAndStoreInAnotherArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = new int[a.length];

		int index = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[index++] = a[i]; // Assign the reversed element and increase index value
		}
		System.out.println(Arrays.toString(b));
	}
}

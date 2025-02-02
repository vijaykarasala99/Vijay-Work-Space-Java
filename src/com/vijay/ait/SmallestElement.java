package com.vijay.ait;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 47, 5, 63, 78, 99 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Smallest element in the array: " + min);
	}
}

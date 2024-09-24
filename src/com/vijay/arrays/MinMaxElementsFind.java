package com.vijay.arrays;

public class MinMaxElementsFind {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 9 };
		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
	}
}

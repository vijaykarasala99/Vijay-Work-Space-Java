package com.vijay.arrays;

public class SecondMax {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 9, 8, 10 };
		int firstmax = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstmax) {
				secondmax = firstmax;
				firstmax = arr[i];
			} else if (arr[i] > secondmax && arr[i] != firstmax) {
				secondmax = arr[i];
			}
		}

		if (secondmax == Integer.MIN_VALUE) {
			System.out.println("There is no second maximum value in the array.");
		} else {
			System.out.println("First Maximum: " + firstmax);
			System.out.println("Second Maximum: " + secondmax);
		}
	}
}

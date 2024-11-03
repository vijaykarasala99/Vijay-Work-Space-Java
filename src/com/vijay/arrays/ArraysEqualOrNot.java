package com.vijay.arrays;

public class ArraysEqualOrNot {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };

		if (a.length != b.length) {
			System.out.println("Arrays are not equal");
		} else {
			boolean areEqual = true;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					areEqual = false;
					break;
				}
			}
			if (areEqual) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are NOT equal");
			}
		}
	}
}


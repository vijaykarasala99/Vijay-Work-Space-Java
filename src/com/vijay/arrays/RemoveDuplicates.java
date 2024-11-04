package com.vijay.arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 5, 4, 5 };

		System.out.println("After Removing Duplicates:");

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

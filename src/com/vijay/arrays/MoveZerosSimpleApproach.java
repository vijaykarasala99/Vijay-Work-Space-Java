package com.vijay.arrays;

import java.util.Arrays;

public class MoveZerosSimpleApproach {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12, 0, 5, 0 };
		int[] result = new int[arr.length];
		int index = 0;
		// First, add all zeros
		for (int num : arr) {
			if (num == 0) {
				result[index++] = 0;
			}
		}
		// Then, add non-zero elements
		for (int num : arr) {
			if (num != 0) {
				result[index++] = num;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}

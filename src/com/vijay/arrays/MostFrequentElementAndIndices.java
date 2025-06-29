package com.vijay.arrays;

import java.util.ArrayList;
import java.util.List;

public class MostFrequentElementAndIndices {

	public static void main(String[] args) {

		int[] arr = { 6, 6, 6, 1, 2, 6, 3, 4, 6 };
		int maxCount = 0;
		int mostFreqElement = arr[0];
		List<Integer> positions = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostFreqElement = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mostFreqElement) {
				positions.add(i);
			}
		}
		System.out.print("Element: " + mostFreqElement + ", Indices: " + positions);
	}
}

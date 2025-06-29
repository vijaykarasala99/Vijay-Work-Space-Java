package com.vijay.arrays;

import java.util.HashMap;

public class UniqueElementsPrintHashmap {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 1, 2, 5, 4, 5 };

		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		// Count occurrences
		for (int num : a) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		// Print unique elements
		for (int num : a) {
			if (frequencyMap.get(num) == 1) {
				System.out.println(num);
			}
		}
	}
}



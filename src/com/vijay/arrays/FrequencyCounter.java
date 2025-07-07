package com.vijay.arrays;

import java.util.*;

public class FrequencyCounter {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 3, 5, 4 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		map.forEach((key, value) -> System.out.println(key + " -> " + value + " time(s)"));
	}
}

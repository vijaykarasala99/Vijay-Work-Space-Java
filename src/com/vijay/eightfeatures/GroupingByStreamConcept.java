package com.vijay.eightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByStreamConcept {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		Map<Boolean, List<Integer>> grouped = Arrays.stream(numbers)
				                             .boxed()
				                             .collect(Collectors.groupingBy(n -> n % 2 == 0));

		System.out.println("Even Numbers: " + grouped.get(true));
		System.out.println("Odd Numbers: " + grouped.get(false));
	}
}
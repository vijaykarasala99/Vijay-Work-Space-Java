package com.vijay.eightfeatures;

import java.util.Arrays;
import java.util.List;

public class FirstHighestExample {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 99, 56);

		// Find the highest value using Java Streams
		Integer highest = numbers.stream().max(Integer::compareTo)
				.orElse(null); 

		if (highest != null) {
			System.out.println("Highest value is: " + highest); // Output the highest value
		} else {
			System.out.println("No values found"); // If the list was empty
		}
	}
}

package com.vijay.eightfeatures;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String input = "commerce";

		String result = input.chars()
				              .distinct()
				              .mapToObj(c -> String.valueOf((char) c))
				              .collect(Collectors.joining());

		System.out.println("After removing duplicates: " + result); // Output: comer
	}
}



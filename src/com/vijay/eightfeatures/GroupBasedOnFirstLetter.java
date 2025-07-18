package com.vijay.eightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBasedOnFirstLetter {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Apricot");

		Map<Character, List<String>> grouped = 
		
				fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));

		grouped.forEach((k, v) -> System.out.println(k + " ==> " + v));

	}
}

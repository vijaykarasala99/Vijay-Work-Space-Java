package com.vijay.eightfeatures;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccuranceUsingStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}
}

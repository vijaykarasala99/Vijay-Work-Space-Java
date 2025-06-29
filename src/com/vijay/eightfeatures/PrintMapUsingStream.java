package com.vijay.eightfeatures;

import java.util.Map;

public class PrintMapUsingStream {
	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(1, "Java", 2, "Spring Boot", 3, "React");

		map.entrySet().stream()
		              .forEach(entry -> System.out.println(entry.getKey() + " → " + entry.getValue()));

		System.out.println("=======================");

		map.entrySet().stream()
		              .forEach(System.out::println);
	}
}

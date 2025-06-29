package com.vijay.eightfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByStringLengths {

	public static void main(String[] args) {
		List<String> names = List.of("Ann", "Bob", "Al", "Joe");

        Map<Integer, List<String>> map = names.stream()
                                              .collect(Collectors.groupingBy(String::length));

        //map.forEach((length, list) -> System.out.println("Length: " + length + " => " + list));
        //map.entrySet().stream().forEach(System.out::println);
        map.entrySet().stream().forEach((entry)->System.out.println(entry.getKey() +" -> " +entry.getValue()));
	}
}

package com.vijay.eightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentElementStream {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4);

        numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(entry -> 
                System.out.println("Most frequent: " + entry.getKey() + " (count: " + entry.getValue() + ")")
            );
    }
}

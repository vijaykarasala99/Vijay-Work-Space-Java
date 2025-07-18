package com.vijay.eightfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class EvenOddSingleStream {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> map = numbers.stream()
        		                          .collect(Collectors.groupingBy(n -> (n % 2 == 0)));

		List<Integer> evenNumbers = map.get(true);
		List<Integer> oddNumbers = map.get(false);

		System.out.println("Even Numbers: " + evenNumbers);
		System.out.println("Odd Numbers: " + oddNumbers);
	}
}

package com.vijay.eightfeatures;

import java.util.Arrays;

public class ArrayMultiplicationUsingStream {
	 public static void main(String[] args) {
      // Sample array of numbers
	 int[] numbers = {1, 2, 3, 4, 5};
	 // Convert the array to a stream, multiply each element by 5, and collect it back into an array
	 int[] multipliedNumbers = Arrays.stream(numbers)
	                                 .map(number -> number * 5)  // Multiply each number by 5
	                                 .toArray();                 // Collect the results into a new array

	        System.out.println(Arrays.toString(multipliedNumbers));

	 }
}


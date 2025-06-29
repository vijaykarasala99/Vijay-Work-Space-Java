package com.vijay.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysClassExample {
	
	    public static void main(String[] args) {
	        
	        // 1. Sorting: sort() and parallelSort()
	        int[] numbers = {5, 2, 8, 1, 3};
	        Arrays.sort(numbers);
	        System.out.println("Sorted Array: " + Arrays.toString(numbers));

	        int[] parallelNumbers = {9, 4, 7, 2, 6};
	        Arrays.parallelSort(parallelNumbers);
	        System.out.println("Parallel Sorted Array: " + Arrays.toString(parallelNumbers));

	         // 2. Searching: binarySearch()
	        //  Arrays.binarySearch() only works correctly on a sorted array.
	       //   If used on an unsorted array, the result is unpredictable.
	       
	       // Why?
	       // Binary search works by repeatedly dividing the sorted array into halves.
	       // If the array is unsorted, the search logic fails because elements are not in a predictable order.

	        int index = Arrays.binarySearch(numbers, 3);
	        System.out.println("Index of 3 in sorted array: " + index);

	        // 3. Filling: fill()
	        int[] filledArray = new int[5];
	        Arrays.fill(filledArray, 7);
	        System.out.println("Filled Array: " + Arrays.toString(filledArray));

	        // 4. Comparing: equals(), mismatch(), deepEquals()
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {1, 2, 3};

	        Integer[][] e1 = { {1, 2, 3}, {4, 5, 6} };
	        Integer[][] e2 = { {1, 2, 3}, {6, 5, 4} };
	        
	        System.out.println("Array1 equals Array2: " + Arrays.equals(array1, array2));
	        System.out.println("e1 equals e2: " + Arrays.deepEquals(e1, e2));

	       
	        // 5. Copying: copyOf(), copyOfRange()
	        int[] copiedArray = Arrays.copyOf(array1, 5);
	        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

	        int[] copiedRange = Arrays.copyOfRange(array1, 1, 3);
	        System.out.println("Copied Range Array: " + Arrays.toString(copiedRange));

	        // 6. Converting: asList(), toString(), deepToString()
	        Integer[] integerArray = {10, 20, 30};
	        List<Integer> list = Arrays.asList(integerArray);
	        System.out.println("Array as List: " + list);

	        System.out.println("String Representation of Array1: " + Arrays.toString(array1));

	        Integer[][] multiArray = {{1, 2}, {3, 4}};
	        System.out.println("Deep String Representation: " + Arrays.deepToString(multiArray));

	        // 7. Parallel Processing: parallelPrefix(), parallelSetAll()
	        int[] parallelArray = {1, 2, 3, 4, 5};
	        Arrays.parallelPrefix(parallelArray, Integer::sum);
	        System.out.println("Parallel Prefix Array: " + Arrays.toString(parallelArray));

	        int[] generatedArray = new int[5];
	        Arrays.parallelSetAll(generatedArray, i -> i * 10);
	        System.out.println("Parallel Set All Array: " + Arrays.toString(generatedArray));
   }
}


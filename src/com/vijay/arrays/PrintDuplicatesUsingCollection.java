package com.vijay.arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesUsingCollection {
	 public static void main(String[] args) {
	        int[] arr = {4, 2, 7, 2, 4, 9, 1, 7};

	        Set<Integer> seen = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (int i = 0; i < arr.length; i++) {
	            if (!seen.add(arr[i])) {
	                duplicates.add(arr[i]);
	            }
	        }
	        System.out.println("Duplicates: " + duplicates);
	    }
}

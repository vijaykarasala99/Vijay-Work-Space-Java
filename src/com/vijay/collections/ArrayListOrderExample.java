package com.vijay.collections;

import java.util.ArrayList;

public class ArrayListOrderExample {
	public static void main(String[] args) {
		
		// Create an ArrayList Follows Insertion Order and accepts duplicate values
		// Index Order after Removals, Index Order after Insertions
		ArrayList<String> list = new ArrayList<>();
		list.add("A"); // index 0
		list.add("B"); // index 1
		list.add("C"); // index 2
		list.add("D"); // index 3

		System.out.println("Original List: " + list);
		// Remove element at index 1
		list.remove(1);
		System.out.println("After removing index 1: " + list);
		// Insert element at index 1
		list.add(1, "E");
		System.out.println("After inserting at index 1: " + list);
		
	}
}

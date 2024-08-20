package com.vijay.collections;

import java.util.ArrayList;

public class ArrayListCapacityExample {
	public static void main(String[] args) {

		// In Java's ArrayList, there is no explicit maximum capacity enforced by the ArrayList class itself.
		// The practical limit is determined by the amount of available memory in the JVM.
		

		try {
			ArrayList<Integer> largeList = new ArrayList<>(Integer.MAX_VALUE);
			System.out.println("Successfully created ArrayList with initial capacity of Integer.MAX_VALUE.");
		} catch (OutOfMemoryError e) {
			System.out.println("Unable to create ArrayList with Integer.MAX_VALUE capacity due to memory constraints.");
		}
	}
}

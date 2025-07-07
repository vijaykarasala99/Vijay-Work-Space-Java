package com.vijay.java11;
import java.util.*;
public class Java11CollectionsCopyOfMethod {

	public static void main(String[] args) {

		// Creating a mutable list and converting to immutable list using copyOf()
		List<String> mutableList = Arrays.asList("a", "b");
		List<String> immutableList = List.copyOf(mutableList);

		// Creating an immutable set using Set.of() and copyOf()
		Set<String> baseSet = Set.of("x", "y");
		Set<String> immutableSet = Set.copyOf(baseSet);

		// Creating an immutable map using Map.of() and copyOf()
		Map<Integer, String> baseMap = Map.of(1, "One", 2, "Two");
		Map<Integer, String> immutableMap = Map.copyOf(baseMap);

		// Displaying the copied immutable collections
		System.out.println("✅ Immutable List: " + immutableList);
		System.out.println("✅ Immutable Set : " + immutableSet);
		System.out.println("✅ Immutable Map : " + immutableMap);

		// Trying to modify will throw UnsupportedOperationException
		try {
			immutableList.add("c");
		} catch (UnsupportedOperationException e) {
			System.out.println("❌ Cannot modify list: " + e);
		}

		try {
			immutableSet.remove("x");
		} catch (UnsupportedOperationException e) {
			System.out.println("❌ Cannot modify set: " + e);
		}

		try {
			immutableMap.put(3, "Three");
		} catch (UnsupportedOperationException e) {
			System.out.println("❌ Cannot modify map: " + e);
		}

	}

}

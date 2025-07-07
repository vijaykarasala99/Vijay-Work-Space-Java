package com.vijay.java11;

import java.util.List;

public class VarCompleteDetails {
// 'var' is a reserved type name introduced in Java 10 that enables local variable type inference.
// In Java 11, 'var' can also be used in lambda parameters.
// It is especially useful when you want to add annotations or modifiers to lambda parameters.
	public static void main(String[] args) {
		// ✅ Java 10: var for local variables
		var name = "Vijay";                      // inferred as String
		var age = 25;                            // inferred as int
		var fruits = List.of("apple", "banana", "mango"); // inferred as List<String>

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

		// ✅ Java 11: var in lambda parameters
		fruits.forEach((var fruit) -> {
			System.out.println("Fruit: " + fruit.toUpperCase());
		});
	}
}




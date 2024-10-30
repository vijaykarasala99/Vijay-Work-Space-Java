package com.vijay.strings;

public class StringImmutabilityExample {

	public static void main(String[] args) {

		/**
		 * modifying the content of one reference would also affect any other references
		 * pointing to the same string. This means that all references would reflect the
		 * change, leading to potential confusion and unexpected behavior.
		 */

		String original = "Hello";

		// Create another reference to the same String object
		String reference = original;

		// Print original and reference
		System.out.println("Original: " + original); // Output: Hello
		System.out.println("Reference: " + reference); // Output: Hello

		// Modify the original string by concatenating another string
		original = original + " World";

		// Print original and reference again
		System.out.println("After modification:");
		System.out.println("Original: " + original); // Output: Hello World
		System.out.println("Reference: " + reference); // Output: Hello
	}
}

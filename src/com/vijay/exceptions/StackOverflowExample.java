package com.vijay.exceptions;

public class StackOverflowExample {

	// StackOverflowError occurs when a method calls itself recursively
	public static void main(String[] args) {
		int n = 50;
		long result = recursiveMethod(n);
		System.out.println(result);
	}

	public static long recursiveMethod(int n) {
		return n * recursiveMethod(n - 1); // This will cause StackOverflowError
	}
}
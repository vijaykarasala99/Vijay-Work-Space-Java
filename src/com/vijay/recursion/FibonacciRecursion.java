package com.vijay.recursion;

public class FibonacciRecursion {
	public static void main(String[] args) {
		int n = 5;
		System.out.print("Fibonacci series up to position " + n + " is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		// Base cases
		if (n == 0) return 0;
		if (n == 1) return 1;
		// Recursive case
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}



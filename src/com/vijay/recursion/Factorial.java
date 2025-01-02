package com.vijay.recursion;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		long result = factorial(n);
		System.out.println("The Factorial of " + n + " is: " + result);
	}

	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}

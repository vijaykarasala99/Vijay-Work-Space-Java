package com.vijay;

import java.util.Scanner;

public class FibonacciRange {
	public static void main(String[] args) {
		// First two numbers in Fibonacci series are 0,1
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the minimum value: ");
		int min = sc.nextInt();
		System.out.print("Enter the maximum value: ");
		int max = sc.nextInt();
		int a = 0, b = 1;

		// Print Fibonacci numbers in the given range
		System.out.print("Fibonacci Series in range [" + min + ", " + max + "]: ");

		while (a <= max) {
			if (a >= min) {
				System.out.print(a + " ");
			}
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}
}



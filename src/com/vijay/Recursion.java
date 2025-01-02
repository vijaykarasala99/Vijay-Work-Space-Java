package com.vijay;

import java.util.Scanner;

public class Recursion {
//"A function calls itself until it reaches the base case, then unwinds to give the result
// if there's no base case, it keeps calling itself and causes a stack overflow error."

	public static long factorial(int n) {
		if (n < 0) {
			System.out.println("Enter a valid non-negative number...");
			return -1;
		} else if (n == 0 || n == 1) {
			return 1; // Base case for factorial of 0 or 1
		}
		return n * factorial(n - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " is: " + factorial(n));
		sc.close();
	}
}

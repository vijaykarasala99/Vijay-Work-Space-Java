package com.vijay;

import java.util.Scanner;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter lower bound: ");
		int a = sc.nextInt();
		System.out.print("enter upper bound: ");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			boolean isPrime = true;
			// one number has factors up-to half of that number
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && a > 1) {
				System.out.println(i); 
			}
		}
		if (a <= 1) {
			System.out.println("give valid number");
		}
	}
}
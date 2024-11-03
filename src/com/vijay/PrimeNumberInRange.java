package com.vijay;

import java.util.Scanner;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter lower bound: ");
		int a = sc.nextInt();
		System.out.print("Enter upper bound: ");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			
			if (i <= 1) continue;
			
			boolean isPrime = true;
			
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}

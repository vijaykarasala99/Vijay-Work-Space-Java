package com.vijay;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		//a number which is divisible by 1 and itself is called prime
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int n = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime && n > 1) {
			System.out.println("prime : " +n);
		} else {
			System.out.println(n +"  : is not prime");
		}
	}
}

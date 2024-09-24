package com.vijay;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");

		int n = sc.nextInt();

		int sum = 0;
		int rem = 0;

		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
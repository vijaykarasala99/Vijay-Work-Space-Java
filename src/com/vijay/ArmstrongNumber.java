package com.vijay;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int temp = n;
		int rem = 0;
		int sum = 0;
		int length = String.valueOf(n).length();

		while (n > 0) {
			rem = n % 10;
			sum += Math.pow(rem, length);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " : is armstrong");
		} else {
			System.out.println(temp + " : Not armstrong");
		}
	}
}

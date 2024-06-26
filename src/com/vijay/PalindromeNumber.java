package com.vijay;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int temp = n;
		int rem = 0;
		int rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println(temp + " :is palindrome");
		} else {
			System.out.println(temp + " :Not-palindrome");

		}
	}
}

package com.vijay;

import java.util.Scanner;

public class PalindromeInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Upper Bound: ");
		int a = sc.nextInt();
		System.out.print("Enter Lower Bound: ");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			int temp = i;
			int rem;
			int rev = 0;

			while (temp != 0) {
				rem = temp % 10;
				rev = (rev * 10) + rem;
				temp = temp / 10;
			}
			if (i == rev) {
				System.out.println(i + "is Palindrome");
			} else {
				System.out.println(i + "is NOT Palindrome");
			}
		}
}
}
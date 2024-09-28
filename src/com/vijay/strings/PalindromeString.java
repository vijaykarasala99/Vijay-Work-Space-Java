package com.vijay.strings;
import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter string:");
		String str1 = sc.nextLine();
		String str2 = "";

		// Remove whitespace and convert to lower-case
		String temp = str1.replaceAll("\\s", "").toLowerCase();
		for (int i = temp.length() - 1; i >= 0; i--) {
			str2 = str2 + temp.charAt(i);
		}

		if (str2.equals(temp)) {
			System.out.println(str1 + " is a Palindrome.");
		} else {
			System.out.println(str1 + " is NOT a palindrome.");
		}
	}
}


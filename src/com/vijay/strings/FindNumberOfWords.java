package com.vijay.strings;

import java.util.Scanner;

public class FindNumberOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();

		if (s == null || s.trim().isEmpty()) {
			System.out.println("Number of words: 0");
		} else {
			// Split the string by one or more whitespace characters
			String[] words = s.trim().split("\\s+");
			System.out.println("Number of words: " + words.length);

		}
		 sc.close();
	}
}

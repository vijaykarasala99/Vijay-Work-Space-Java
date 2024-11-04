package com.vijay.strings;

import java.util.Scanner;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) { // Check all previous characters
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				result += arr[i];
			}
		}
		System.out.println("String after removing duplicates: " + result);
		sc.close();
	}
}

package com.vijay.strings;

import java.util.Iterator;
import java.util.Scanner;

public class MaxOccuringCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();

		int maxCount = 0;
		char maxChar = ' ';
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxChar = s.charAt(i);
			}
		}

		System.out.println("Max count: " + maxCount + " Character is: " + maxChar);
	}
}

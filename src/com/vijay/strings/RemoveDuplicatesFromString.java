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
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag =false;
					break;
				}
			}
			if (flag) {
				result += arr[i];
			}
		}
		System.out.println("String after removing duplicates: " + result);
	}
}
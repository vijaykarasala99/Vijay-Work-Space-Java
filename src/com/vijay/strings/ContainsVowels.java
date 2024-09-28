package com.vijay.strings;

public class ContainsVowels {
	public static void main(String[] args) {
		String s = "hello vijay";
		s = s.toLowerCase();
		boolean contains = false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				contains = true;
				break;
			}
		}
		if (contains) {
			System.out.println("contains vowels");
		} else {
			System.out.println("does not contain vowels");
		}
	}
}

package com.vijay.strings;

public class VowelsConsonentsInString {
	public static void main(String[] args) {
		String str = "JavA Program 123 @#$";
		str = str.toLowerCase();
		int vowels = 0, consonents = 0, whites = 0, special = 0, digits = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonents++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else if (Character.isWhitespace(ch)) {
				whites++;
			} else {
				special++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonents);
		System.out.println(whites);
		System.out.println(digits);
		System.out.println(special);

	}
}

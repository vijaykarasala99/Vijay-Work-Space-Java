package com.vijay.strings;

import java.util.*;

public class ContainsVowelsPrint {
	public static void main(String[] args) {
		String s = "helloAO vijay JAVA";

		List<Character> capitalVowels = new ArrayList<>();
		List<Character> smallVowels = new ArrayList<>();
		List<Character> capitalConsonants = new ArrayList<>();
		List<Character> smallConsonants = new ArrayList<>();

		for (char ch : s.toCharArray()) {
			if (Character.isLetter(ch)) {
				if ("AEIOU".indexOf(ch) != -1) {
					capitalVowels.add(ch);
				} else if ("aeiou".indexOf(ch) != -1) {
					smallVowels.add(ch);
				} else if (Character.isUpperCase(ch)) {
					capitalConsonants.add(ch);
				} else {
					smallConsonants.add(ch);
				}
			}
		}
		System.out.println("Small Vowels: " + smallVowels);
		System.out.println("Capital Vowels: " + capitalVowels);
		System.out.println("Small Consonants: " + smallConsonants);
		System.out.println("Capital Consonants: " + capitalConsonants);

		System.out.println("\n============== If You Need Count ==============\n");

		System.out.println("Small Vowels: " + smallVowels + " | Count: " + smallVowels.size());
		System.out.println("Capital Vowels: " + capitalVowels + " | Count: " + capitalVowels.size());
		System.out.println("Small Consonants: " + smallConsonants + " | Count: " + smallConsonants.size());
		System.out.println("Capital Consonants: " + capitalConsonants + " | Count: " + capitalConsonants.size());
	}
}

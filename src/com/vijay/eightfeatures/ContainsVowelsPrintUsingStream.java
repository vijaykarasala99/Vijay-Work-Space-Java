package com.vijay.eightfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsVowelsPrintUsingStream {

	public static void main(String[] args) {
		String s = "helloAO vijay JAVA";

		List<Character> chars = s.chars()
				                .mapToObj(c -> (char) c)
				                .filter(Character::isLetter)
				                .collect(Collectors.toList());

		List<Character> smallVowels = chars.stream().filter(c -> "aeiou".indexOf(c) != -1)
				                       .collect(Collectors.toList());
		List<Character> capitalVowels = chars.stream().filter(c -> "AEIOU".indexOf(c) != -1)
				                        .collect(Collectors.toList());
		List<Character> smallConsonants = chars.stream()
		.filter(c -> Character.isLowerCase(c) && "aeiou".indexOf(c) == -1).collect(Collectors.toList());
		List<Character> capitalConsonants = chars.stream()
		.filter(c -> Character.isUpperCase(c) && "AEIOU".indexOf(c) == -1).collect(Collectors.toList());

		System.out.println("Small Vowels: " + smallVowels);
		System.out.println("Capital Vowels: " + capitalVowels);
		System.out.println("Small Consonants: " + smallConsonants);
		System.out.println("Capital Consonants: " + capitalConsonants);
	}
}




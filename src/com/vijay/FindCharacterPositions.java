package com.vijay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindCharacterPositions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.print("Enter the character to find: ");
		char ch = sc.next().charAt(0);

		// List to store the positions of the character
		List<Integer> positions = new ArrayList<>();

		// Iterate through the string to find all occurrences of the character
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				positions.add(i);
			}
		}
		System.out.println("Character '" + ch + "' found at position: " + positions);
		sc.close();
	}
}

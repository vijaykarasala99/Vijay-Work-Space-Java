package com.vijay.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Map<Character, Integer> lettercount = new HashMap<>();
        
        // Count occurrences of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            lettercount.put(ch, lettercount.getOrDefault(ch, 0) + 1);
        }
        
        // Print each character's occurrences
        System.out.println("Character occurrences:");
        for (Character ch : lettercount.keySet()) {
            System.out.println(ch + " is occured : " + lettercount.get(ch));
        }
        scanner.close();
    }
}

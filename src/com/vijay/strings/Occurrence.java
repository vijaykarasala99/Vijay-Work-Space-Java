package com.vijay.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        // Check if the string is null or empty
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Invalid input: Please enter a valid string.");
        }

        System.out.print("Enter a character to find its occurrence: ");
        char ch = sc.next().charAt(0);

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                positions.add(i);
            }
        }
        if (positions.isEmpty()) {
            System.out.println("Character '" + ch + "' not found in the String.");
        } else {
            System.out.println("Character '" + ch + "' found at positions: " + positions);
        }
    }
}



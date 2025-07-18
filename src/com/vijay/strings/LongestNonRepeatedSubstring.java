package com.vijay.strings;

import java.util.Scanner;

public class LongestNonRepeatedSubstring {

    public static void main(String[] args) {
        // Longest Non-Repeated Substring
        // i/p: welcometojavaworld
        // o/p: metojav

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String longest = "", current = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (current.contains(ch)) {
                current = current.substring(current.indexOf(ch) + 1);
            }
            current += ch;

            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println("Longest non-repeated substring: " + longest);
        sc.close();
    }
}

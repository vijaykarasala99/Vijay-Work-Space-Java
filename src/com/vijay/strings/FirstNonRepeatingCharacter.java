package com.vijay.strings;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
       
        String s = "vyavijijay";
        char result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character occurs only once in the string
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                result = ch;                           // Store the first non-repeating character
                break;                                 // Exit the loop once we find the first non-repeating character
            }
        }
        if (result != 0) {
            System.out.println("The First Non-Repeating Character is: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found...");
        }
    }
}

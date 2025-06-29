package com.vijay.strings;

public class MissingDigitFinder {

    public static void main(String[] args) {
        String input = "152469";

        for (int i = 1; i <= 9; i++) {
            if (!input.contains(String.valueOf(i))) {
                System.out.println("Missing number: " +i);
            }
        }
    }
} 

// Set Version For Better Scalability

/**
Set<Character> digits = new HashSet<>();
for (char ch : input.toCharArray()) {
    digits.add(ch);
}

for (char ch = '1'; ch <= '9'; ch++) {
    if (!digits.contains(ch)) {
        System.out.println("Missing number: " + ch);
}
*/


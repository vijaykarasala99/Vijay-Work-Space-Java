package com.vijay.ait;
public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}


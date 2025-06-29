package com.vijay.strings;

import java.util.*;

public class ContainsVowelsListOut {
    public static void main(String[] args) {
        String s = "helloAO vijay";
        s = s.toLowerCase();

        List<String> vowels = new LinkedList<>();
        List<String> consonants = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".contains(ch + "")||"AEIOU".contains(ch+"")) {
                    vowels.add(ch + "");
                } else {
                    consonants.add(ch + "");
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}



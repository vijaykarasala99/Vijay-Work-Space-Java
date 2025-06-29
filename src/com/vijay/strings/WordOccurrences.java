package com.vijay.strings;

import java.util.*;

public class WordOccurrences {
    public static void main(String[] args) {
        String str = "I love my India and I Respect india";
        str=str.toLowerCase();
        String[] words = str.split("\\s+");

        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        wordCount.forEach((word, count) -> System.out.println(word + " = " + count));
    }
}

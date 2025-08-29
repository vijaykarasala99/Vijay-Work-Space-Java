package com.vijay.eightfeatures;

import java.util.*;

public class ThirdLongestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "mango", "kiwi");

        words.stream()
             .sorted((a, b) -> b.length() - a.length()) // sort desc by length
             .skip(2)                                   // skip first 2
             .findFirst()
             .ifPresent(System.out::println);
    }
}


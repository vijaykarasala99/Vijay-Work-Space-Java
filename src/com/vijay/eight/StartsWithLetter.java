package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class StartsWithLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot");
        words.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
    }
}


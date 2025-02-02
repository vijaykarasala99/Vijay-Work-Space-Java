package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class FilterByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat");
        words.stream().filter(s -> s.length() <= 5).forEach(System.out::println);
    }
}


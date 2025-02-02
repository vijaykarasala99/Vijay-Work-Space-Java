package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "fig");
        List<String> sorted = words.stream().sorted((s1, s2) -> s1.length() - s2.length()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}

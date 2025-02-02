package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String longest = words.stream().max((s1, s2) -> s1.length() - s2.length()).orElse("");
        System.out.println(longest);
    }
}

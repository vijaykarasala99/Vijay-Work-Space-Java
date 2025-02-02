package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class MaxStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        int maxLength = words.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(maxLength);
    }
}


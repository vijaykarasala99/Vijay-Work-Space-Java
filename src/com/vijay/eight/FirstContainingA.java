package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
public class FirstContainingA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream().filter(s -> !s.contains("a")).findFirst().ifPresent(System.out::println);
    }
}

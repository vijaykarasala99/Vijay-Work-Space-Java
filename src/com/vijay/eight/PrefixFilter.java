package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class PrefixFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry");
        words.stream().filter(s -> s.startsWith("ap")).forEach(System.out::println);
    }
}

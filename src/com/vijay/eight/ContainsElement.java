package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class ContainsElement {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        boolean contains = words.stream().anyMatch(s -> s.equals("banana"));
        System.out.println(contains);
    }
}

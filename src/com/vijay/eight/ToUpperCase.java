package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        List<String> upper = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
    }
}

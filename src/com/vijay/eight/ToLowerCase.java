package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("HELLO", "WORLD");
        List<String> lower = words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lower);
    }
}


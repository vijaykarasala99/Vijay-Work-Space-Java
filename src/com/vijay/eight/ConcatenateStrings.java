package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");
        String result = words.stream().collect(Collectors.joining(" "));
        System.out.println(result);
    }
}


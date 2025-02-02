package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortStringsReverse {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Collections.sort(words, (s1, s2) -> s2.compareTo(s1));
        System.out.println(words);
    }
}

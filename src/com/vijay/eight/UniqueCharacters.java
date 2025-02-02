package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Set<Character> uniqueChars = words.stream()
                                          .flatMapToInt(String::chars)
                                          .mapToObj(c -> (char) c)
                                          .collect(Collectors.toSet());
        System.out.println(uniqueChars);
    }
}

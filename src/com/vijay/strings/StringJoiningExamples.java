package com.vijay.strings;
import java.util.StringJoiner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringJoiningExamples {

    public static void main(String[] args) {

        // 1. Using StringJoiner
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("apple").add("banana").add("grape");
        System.out.println("Using StringJoiner: " + joiner);

        // 2. Using String.join()
        String joinedStr = String.join(", ", "apple", "banana", "grape");
        System.out.println("Using String.join(): " + joinedStr);

        // 3. Using Collectors.joining() with Stream
        List<String> fruits = Arrays.asList("apple", "banana", "grape");
        String collectedStr = fruits.stream()
                                    .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Using Collectors.joining(): " + collectedStr);
   }
}



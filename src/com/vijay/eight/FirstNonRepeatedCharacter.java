package com.vijay.eight;import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        str.chars()
           .mapToObj(c -> (char) c)
           .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
           .entrySet().stream()
           .filter(e -> e.getValue() == 1)
           .map(Map.Entry::getKey)
           .findFirst()
           .ifPresent(System.out::println);
    }
}

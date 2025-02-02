package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNulls {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", null, "banana", null);
        List<String> nonNull = strings.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(nonNull);
    }
}

package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);
    }
}


package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 3, 1);
        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}

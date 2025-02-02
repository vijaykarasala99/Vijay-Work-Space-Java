package com.vijay.eight;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;


public class DoubleNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> doubled = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(doubled);
    }
}

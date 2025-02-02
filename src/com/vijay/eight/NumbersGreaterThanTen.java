package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class NumbersGreaterThanTen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        numbers.stream().filter(n -> n > 10).forEach(System.out::println);
    }
}

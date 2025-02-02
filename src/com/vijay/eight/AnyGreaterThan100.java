package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class AnyGreaterThan100 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 150);
        boolean result = numbers.stream().anyMatch(n -> n > 100);
        System.out.println(result);
    }
}

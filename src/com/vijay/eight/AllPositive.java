package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class AllPositive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println(allPositive);
    }
}

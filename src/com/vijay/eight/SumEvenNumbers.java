package com.vijay.eight;
import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> secondLargest = numbers.stream()
                                                 .sorted((n1, n2) -> n2 - n1)
                                                 .skip(1)
                                                 .findFirst();
        secondLargest.ifPresent(System.out::println);
    }
}

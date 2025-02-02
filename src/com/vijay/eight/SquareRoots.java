package com.vijay.eight;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareRoots {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 9, 16);
        List<Double> squareRoots = numbers.stream().map(Math::sqrt).collect(Collectors.toList());
        System.out.println(squareRoots);
    }
}

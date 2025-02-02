package com.vijay.eight;
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumbers {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println(randomNumber.get());
    }
}

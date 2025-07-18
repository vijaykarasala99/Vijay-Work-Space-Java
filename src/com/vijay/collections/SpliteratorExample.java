package com.vijay.collections;
import java.util.*;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "Go");

        Spliterator<String> spliterator = list.spliterator();

        // Split the list
        Spliterator<String> spliterator2 = spliterator.trySplit();

        System.out.println("First half:");
        spliterator.forEachRemaining(System.out::println);

        System.out.println("Second half:");
        spliterator2.forEachRemaining(System.out::println);
    }
}

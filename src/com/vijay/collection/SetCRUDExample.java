package com.vijay.collection;

import java.util.*;

public class SetCRUDExample {
    public static void main(String[] args) {
        Set<String> techSet = new HashSet<>();

        // Create
        techSet.add("Java");
        techSet.add("Python");
        techSet.add("C++");

        // Read
        System.out.println("All elements:");
        techSet.forEach(System.out::println);

        // Update "Java" to "Java SE"
        if (techSet.contains("Java")) {
            techSet.remove("Java");
            techSet.add("Java SE");
        }

        // Delete "C++"
        techSet.remove("C++");

        // Final output
        System.out.println("After Update & Delete:");
        techSet.forEach(System.out::println);
    }
}

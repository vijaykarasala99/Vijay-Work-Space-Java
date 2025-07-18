package com.vijay.collections;
import java.util.*;
import java.util.stream.*;

public class MapVsFlatMapExample {
    public static void main(String[] args) {
        // Nested list
        List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("c", "d"),
            Arrays.asList("e", "f")
        );

        // Using map() → Keeps nested structure
        List<List<String>> mapped = nestedList.stream()
            .map(list -> list)
            .collect(Collectors.toList());

        System.out.println("Using map():");
        System.out.println(mapped); // Output: [[a, b], [c, d], [e, f]]

        // Using flatMap() → Flattens the structure
        List<String> flatMapped = nestedList.stream()
            .flatMap(list -> list.stream())
            .collect(Collectors.toList());

        System.out.println("\nUsing flatMap():");
        System.out.println(flatMapped); // Output: [a, b, c, d, e, f]
    }
}

package com.vijay.eightfeatures;

import java.util.*;
import java.util.stream.*;

public class ThirdHighestExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 99, 56);

        Optional<Integer> thirdHighest = numbers.stream()
            .distinct() // Remove duplicates
            .sorted(Comparator.reverseOrder()) // Sort in descending order
            .skip(2)                           // Skip the first two highest elements
            .findFirst();                      // Get the third highest

        if (thirdHighest.isPresent()) {
            System.out.println("Third highest value is: " + thirdHighest.get());
        } else {
            System.out.println("Third highest value not found");
        }
    }
}




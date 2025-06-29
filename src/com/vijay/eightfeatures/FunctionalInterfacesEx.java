package com.vijay.eightfeatures;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfacesEx {

    public static void main(String[] args) {

        // ---------------------------------------------------
        // Function<T, R>
        // Package: java.util.function
        // Method: R apply(T t)
        // Purpose: Converts/Transforms input T to output R
        // Returns: A value of type R
        // Used when: Processing and returning a result
        // ---------------------------------------------------
        Function<String, Integer> function = s -> s.length();
        System.out.println("Function result: " + function.apply("Vijay")); // Output: 5
       
        // ---------------------------------------------------
        // Predicate<T>
        // Package: java.util.function
        // Method: boolean test(T t)
        // Purpose: Checks a condition
        // Returns: true or false
        // Used when: Filtering or validation
        // ---------------------------------------------------
        Predicate<Integer> predicate = n -> n > 10;
        System.out.println("Predicate result: " + predicate.test(15)); // Output: true

        // ---------------------------------------------------
        // Consumer<T>
        // Package: java.util.function
        // Method: void accept(T t)
        // Purpose: Performs action, does not return anything
        // Returns: void
        // Used when: Performing action like printing/logging
        // ---------------------------------------------------
        Consumer<String> consumer = name -> System.out.println("Consumer result: Hello " + name);
        consumer.accept("Vijay"); // Output: Hello Vijay

        // ---------------------------------------------------
        // Supplier<T>
        // Package: java.util.function
        // Method: T get()
        // Purpose: Supplies a value
        // Returns: A value of type T
        // Used when: You need to supply/generate data
        // ---------------------------------------------------
        Supplier<String> supplier = () -> "Java Supplier Value";
        System.out.println("Supplier result: " + supplier.get()); // Output: Java Supplier Value
    }
}


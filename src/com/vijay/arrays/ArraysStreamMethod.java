package com.vijay.arrays;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysStreamMethod {
    public static void main(String[] args) {
        
        // Example 1: Convert String Array to Stream
        String[] names = { "Alice", "Bob", "Charlie" };
        System.out.println("Names:");
        Stream<String> nameStream = Arrays.stream(names);
        nameStream.forEach(System.out::println);
        
        System.out.println("\n------------------\n");

        // Example 2: Sum of Elements in an Integer Array
        int[] numbers = { 10, 20, 30, 40 };
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);

        System.out.println("\n------------------\n");

        // Example 3: Filter Even Numbers from an Array
        int[] moreNumbers = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Even numbers:");
        Arrays.stream(moreNumbers)
              .filter(n -> n % 2 == 0)
              .forEach(System.out::println);
       
        System.out.println("\n------------------\n");

        //Example 4: Collect even numbers into a List
        List<Integer> evenNumbers = Arrays.stream(moreNumbers)
                                          .filter(n -> n % 2 == 0)
                                          .boxed()  // Convert int to Integer
                                          .collect(Collectors.toList());
        System.out.println("List Of Even numbers: " + evenNumbers);
        
    }
}


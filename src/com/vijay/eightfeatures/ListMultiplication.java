package com.vijay.eightfeatures;
import java.util.Arrays;
import java.util.List;

public class ListMultiplication {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(2, 2, 3, 4, 2);
      
        // Multiply all elements using reduce
        int result = numbers.stream()
                            .reduce(1, (product, number) -> product * number); // Initial value is 1

        // Print the result
        System.out.println("Result of multiplying all elements: " + result);
    }
}

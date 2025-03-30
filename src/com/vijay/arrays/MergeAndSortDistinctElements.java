package com.vijay.arrays;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeAndSortDistinctElements {
    public static void main(String[] args) {
        Integer array1[] = {5, 3, 9, 1, 6, 5};
        Integer array2[] = {3, 7, 1, 8, 10, 9};

        // Merging, removing duplicates, and sorting
        Integer result[] = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                                 .distinct()
                                 .sorted()
                                 .toArray(Integer[]::new);

        // Printing the result
        System.out.println("Merged and Sorted Unique Elements: " + Arrays.toString(result));
    }
}

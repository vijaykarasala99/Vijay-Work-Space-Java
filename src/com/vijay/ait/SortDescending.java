package com.vijay.ait;

import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] arr = {10, 25, 47, 5, 63, 78, 99};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}

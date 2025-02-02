package com.vijay.arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 47, 63, 78, 99};
        int key = 47;
        int index = Arrays.binarySearch(arr, key);
        System.out.println(key + " found at index: " + (index >= 0 ? index : "Not found"));
    }
}

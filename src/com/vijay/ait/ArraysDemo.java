package com.vijay.ait;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 5, 63};
        
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 25);
        System.out.println("Index of 25: " + index);

        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(newArr));

        Arrays.fill(newArr, 0);
        System.out.println("Array after fill: " + Arrays.toString(newArr));
    }
}

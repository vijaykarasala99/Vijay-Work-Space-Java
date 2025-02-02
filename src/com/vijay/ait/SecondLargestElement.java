package com.vijay.ait;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 89, 63, 78, 99};
        Arrays.sort(arr);
        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }
}

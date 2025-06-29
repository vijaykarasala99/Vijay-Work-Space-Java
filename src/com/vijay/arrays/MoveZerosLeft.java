package com.vijay.arrays;
import java.util.Arrays;

public class MoveZerosLeft {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12, 0, 5 };
        int index = arr.length - 1; // Start filling from the end

        // Move non-zero elements to the right
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }
        // Fill the remaining left positions with zeros
        while (index >= 0) {
            arr[index--] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

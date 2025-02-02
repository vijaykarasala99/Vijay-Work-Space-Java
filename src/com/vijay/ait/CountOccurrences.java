package com.vijay.ait;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 10, 63, 78, 10};
        int key = 10, count = 0;

        for (int num : arr) {
            if (num == key) count++;
        }
        System.out.println("Element " + key + " appears " + count + " times.");
    }
}

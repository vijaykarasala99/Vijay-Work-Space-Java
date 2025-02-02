package com.vijay.ait;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 47};
        int[] arr2 = {5, 63, 78};
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}

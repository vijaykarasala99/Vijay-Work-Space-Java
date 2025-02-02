package com.vijay.ait;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 47, 5, 63};
        int[] arr2 = {10, 25, 47, 5, 63};

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Are arrays equal? " + isEqual);
    }
}

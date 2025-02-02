package com.vijay.arrays;

public class CommonArrayExceptions {

    public static void main(String[] args) {
        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing invalid index: " + arr[3]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            int[] arr = null;
            System.out.println("Accessing null array: " + arr[0]);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 3. NegativeArraySizeException
        try {
            int[] arr = new int[-5]; // Negative size
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        // 4. ClassCastException (with Object arrays)
        try {
            Object[] arr = new Object[3];
            arr[0] = "Hello";
            StringBuilder sb = (StringBuilder) arr[0]; // Invalid cast
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // 5. ArrayStoreException
        try {
            Object[] arr = new String[3]; // Array of String type
            arr[0] = 42; // Attempting to store an integer
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }

        // 6. IllegalArgumentException (in array operations like System.arraycopy)
        try {
            int[] src = {1, 2, 3};
            int[] dest = new int[2];
            System.arraycopy(src, 0, dest, 0, 4); // Invalid length
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        System.out.println("Program execution completed!");
    }
}


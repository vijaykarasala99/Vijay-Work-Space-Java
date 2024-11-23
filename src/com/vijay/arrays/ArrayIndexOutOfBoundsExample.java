package com.vijay.arrays;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Array with 5 elements (index 0 to 4)

        // Accessing an invalid index (index 5 is out of bounds)
        System.out.println(arr[5]);  // This will throw ArrayIndexOutOfBoundsException

        // Accessing a negative index (index -1 is invalid)
        System.out.println(arr[-1]);  // This will also throw ArrayIndexOutOfBoundsException
    }
}

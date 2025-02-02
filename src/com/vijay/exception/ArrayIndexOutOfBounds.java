package com.vijay.exception;
public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]); // Accessing an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds." +e.getMessage());
        }
    }
}

package com.vijay.arrays;

public class ArrayExceptionsDemo {
    public static void main(String[] args) {
        
        // 1️⃣ ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ❌ Accessing an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 2️⃣ NullPointerException
        try {
            int[] arr = null;
            System.out.println(arr[0]); // ❌ Accessing a null array
        } catch (NullPointerException e) {
            System.out.println("⚠ NullPointerException: " + e.getMessage());
        }

        // 3️⃣ NegativeArraySizeException
        try {
            int[] negativeArray = new int[-5]; // ❌ Invalid array size
        } catch (NegativeArraySizeException e) {
            System.out.println("⚠ NegativeArraySizeException: " + e.getMessage());
        }

        // 4️⃣ ClassCastException
        try {
            Object objArray = new String[]{"Java", "Python", "C++"};
            Integer[] intArray = (Integer[]) objArray; // ❌ Wrong casting
        } catch (ClassCastException e) {
            System.out.println("⚠ ClassCastException: " + e.getMessage());
        }

        // 5️⃣ ArrayStoreException
        try {
            Object[] objArr = new Integer[5];
            objArr[0] = "Hello"; // ❌ Storing String in Integer array
        } catch (ArrayStoreException e) {
            System.out.println("⚠ ArrayStoreException: " + e.getMessage());
        }
    }
}

package com.vijay.arrays;
public class ReverseArrayForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = new int[arr.length]; 

        int index = 0;  // Index for the reversed array

        // Using for-each to iterate over the array and reverse it
        for (int num : arr) {
            reversed[arr.length - 1 - index] = num;  // Placing elements in reverse order
            index++;
        }
        // Printing reversed array
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}

package com.vijay.ait;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 5, 63};
        System.out.print("Reversed array: ");
        
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


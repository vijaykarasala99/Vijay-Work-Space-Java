package com.vijay.ait;

public class ContainsElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 5, 63};
        int key = 47;
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        System.out.println("Element " + key + (found ? " is present." : " is not present."));
    }
}

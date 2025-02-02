package com.vijay.ait;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 47, 5, 63};
        int[] arr2 = {5, 63, 78, 10};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        System.out.print("Common elements: ");
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

package com.vijay.ait;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 10, 63, 78, 10};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Array without duplicates: " + set);
    }
}


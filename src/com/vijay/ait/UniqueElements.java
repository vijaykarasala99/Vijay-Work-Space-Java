package com.vijay.ait;

import java.util.HashMap;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 10, 63, 78, 10, 25};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.print("Unique elements: ");
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}

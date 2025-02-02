package com.vijay.collection;

import java.util.HashSet;

public class HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate

        if (set.size() < 3) {
            System.out.println("HashSet contains duplicates.");
        } else {
            System.out.println("HashSet does not contain duplicates.");
        }
    }
}


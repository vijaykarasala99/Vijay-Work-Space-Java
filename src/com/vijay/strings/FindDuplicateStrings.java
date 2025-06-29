package com.vijay.strings;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "cherry", "apple", "date", "banana" };

        HashSet<String> set = new HashSet<>();
        ArrayList<String> duplicates = new ArrayList<>();

        // Step 1: Add all to set
        for (String s : arr) {
            if (!set.contains(s)) {
                set.add(s); 
            } else {
                if (!duplicates.contains(s)) {
                    duplicates.add(s); 
                }
            }
        }
        System.out.println("Duplicates: " + duplicates);
        System.out.println("After Removing Duplicates: " + set);
    }
}





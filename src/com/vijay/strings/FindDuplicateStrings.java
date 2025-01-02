package com.vijay.strings;


import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateStrings {

    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "cherry", "apple", "date", "banana" };
        HashSet<String> set = new HashSet<>();
        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]) && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);  
            } else {
                set.add(arr[i]); 
            }
        }
        System.out.println(duplicates);
    }
}



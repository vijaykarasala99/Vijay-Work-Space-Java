package com.vijay.collection;

import java.util.HashMap;

public class SimpleHashMapCollision {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("A", "Avocado");             // Same key → equals() true → value replaced
        map.put(new String("A"), "Apricot"); // Same content, new object → equals() true → value replaced
        map.put("B", "Banana");              // New key → new entry
       
        System.out.println(map);            // Output: {A=Apricot, B=Banana}
    }
}

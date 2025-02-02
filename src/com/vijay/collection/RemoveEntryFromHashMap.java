package com.vijay.collection;
import java.util.HashMap;

public class RemoveEntryFromHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);

        map.remove("Apple");
        System.out.println("HashMap after removing 'Apple': " + map);
    }
}

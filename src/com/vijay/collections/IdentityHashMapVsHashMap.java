package com.vijay.collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapVsHashMap {
	
    public static void main(String[] args) {
        // Create two different String objects with the same content
        String key1 = new String("hello");
        String key2 = new String("hello");

        // HashMap example
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(key1, "value1");
        hashMap.put(key2, "value2");

        System.out.println("HashMap size: " + hashMap.size()); // Output: 1
        System.out.println("HashMap content: " + hashMap);

        // IdentityHashMap example
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, "value1");
        identityMap.put(key2, "value2");

        System.out.println("IdentityHashMap size: " + identityMap.size()); // Output: 2
        System.out.println("IdentityHashMap content: " + identityMap);
    }
}


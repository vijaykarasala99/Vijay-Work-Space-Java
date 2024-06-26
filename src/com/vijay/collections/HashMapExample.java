package com.vijay.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "guntur");
		map.put(6, "guntur");
		map.put(2, "vijay");
		map.put(3, null);
		map.put(null, null);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(2));
        System.out.println(map.containsValue("guntur"));
        System.out.println(map.containsKey(1));
           
        // Remove a key-value pair
        map.remove(3);
        System.out.println(map);
        
        
        System.out.println("===========================");

         
        // Iterate over the keys
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println("===========================");
        
        // Iterate over the values
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
        System.out.println("===========================");
        // Iterate over the entries
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the map
        map.clear();

	}
}

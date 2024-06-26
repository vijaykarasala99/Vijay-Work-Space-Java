package com.vijay.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        
        // Add key-value pairs to the SortedMap
        sortedMap.put(10,"vijay");
        sortedMap.put(9,"me");
        sortedMap.put(11,"hi");
        sortedMap.put(8,null);
// below null,null gives null pointer exception bcz it maintains natural-sorting order based on key
//sortedMap.put(null,null);

        // Display the SortedMap (keys will be sorted in natural order)
        System.out.println("SortedMap: " + sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println("========");
        System.out.println(sortedMap.subMap(8, 89));
        
        // Accessing elements
        System.out.println("Value for 'hi': " + sortedMap.get(11));
        
        
        
        
        
        
	
}
}








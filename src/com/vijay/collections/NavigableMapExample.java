package com.vijay.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		 
		    NavigableMap<Integer, String> navigableMap = new TreeMap<>();
	        
	        // Adding elements to the NavigableMap
	        navigableMap.put(1, "One");
	        navigableMap.put(2, "Two");
	        navigableMap.put(3, "Three");
	        navigableMap.put(4, "Four");
	        navigableMap.put(5, "Five");
	        
	        // Display the NavigableMap
	        System.out.println("NavigableMap: " + navigableMap);
	        System.out.println("==============================");
	        
	        // Example of navigation methods
	        System.out.println("Lower Entry for 3: " + navigableMap.lowerEntry(3));
	        System.out.println("Floor Entry for 3: " + navigableMap.floorEntry(3));
	        System.out.println("Ceiling Entry for 3: " + navigableMap.ceilingEntry(3));
	        System.out.println("Higher Entry for 3: " + navigableMap.higherEntry(3));
	        System.out.println("==============================");
	        // Example of descending map
	        System.out.println("Descending Map: " + navigableMap.descendingMap());
	        System.out.println("==============================");
	        // Example of sub map
	        System.out.println("Sub Map from 2 to 4: " + navigableMap.subMap(2, true, 4, true));
	        System.out.println("==============================");
	        // Example of poll methods
	        System.out.println("Poll First Entry: " + navigableMap.pollFirstEntry());
	        System.out.println("Poll Last Entry: " + navigableMap.pollLastEntry());
	        System.out.println("==============================");
	        // Display the NavigableMap after polling
	        System.out.println("NavigableMap after polling: " + navigableMap);
	    }

}

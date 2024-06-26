package com.vijay.collections;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
	 public static void main(String[] args) {
	        // TreeMap with natural ordering
	        TreeMap<Integer, String> treeMap = new TreeMap<>();
	        treeMap.put(3, "three");
	        treeMap.put(1, "one");
	        treeMap.put(4, "four");
	        treeMap.put(2, "two");
	        treeMap.put(5,null);

	        // Display the TreeMap (keys will be in sorted order)
	        System.out.println("TreeMap: " + treeMap);
	        System.out.println(treeMap.get(3));
	        System.out.println(treeMap.firstKey());
	       System.out.println(treeMap.subMap(1, 3)); 

	 }
}











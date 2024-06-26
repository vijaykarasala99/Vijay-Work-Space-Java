package com.vijay.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "vijay");
		map.put(1, "vijay");
		map.put(2, "karasala");
		map.put(5, null);
		map.put(null, null);
		System.out.println(map);
		
		
		
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
		for (String value : map.values()) {
			System.out.println(value);
	}
}}

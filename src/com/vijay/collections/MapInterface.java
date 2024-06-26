package com.vijay.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		// put method
		map.put("one", 1);
		map.put("two", 2);
		// get method
		System.out.println("Value for key 'one': " + map.get("one"));
		// containsKey method
		System.out.println("Contains key 'two': " + map.containsKey("two"));
		// containsValue method
		System.out.println("Contains value 2: " + map.containsValue(2));
		// size method
		System.out.println("Size of the map: " + map.size());
		// isEmpty method
		System.out.println("Is the map empty?: " + map.isEmpty());
		// remove method
		map.remove("one");
		System.out.println("After removing key 'one': " + map);
		// clear method
		map.clear();
		System.out.println("After clearing the map: " + map.isEmpty());

}
}






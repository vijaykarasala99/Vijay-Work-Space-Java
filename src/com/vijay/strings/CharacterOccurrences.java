package com.vijay.strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrences {
/**
	   output: j-1
	           a-1 
	           v-1 
	           a-2
*/	
	public static void main(String[] args) {
		String s = "java";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			System.out.println(ch + "-" + map.get(ch));
		}
	}
}

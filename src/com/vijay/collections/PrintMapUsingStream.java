package com.vijay.collections;

import java.util.HashMap;
import java.util.Map;

public class PrintMapUsingStream {

	 public static void main(String[] args) {
		    Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Mr.");
	        map.put(2, "VIJAY");
	        map.put(3, "KARASALA");
	       
	       map.entrySet().stream().
	       forEach(e-> System.out.println(e.getKey() + " = " +e.getValue()));
	    	
}
}

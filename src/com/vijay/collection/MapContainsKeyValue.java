package com.vijay.collection;
import java.util.HashMap;

public class MapContainsKeyValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);

        System.out.println("Contains key 'Apple': " + map.containsKey("Apple"));
        System.out.println("Contains value 10: " + map.containsValue(10));
    }
}

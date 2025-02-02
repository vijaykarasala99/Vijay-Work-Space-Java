package com.vijay.ait;
import java.util.HashMap;

public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char maxChar = ' ';
        int maxCount = 0;

        for (char key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxChar = key;
                maxCount = map.get(key);
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
    }
}

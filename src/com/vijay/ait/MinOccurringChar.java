package com.vijay.ait;
import java.util.HashMap;

public class MinOccurringChar {
    public static void main(String[] args) {
        String str = "helloworld";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char minChar = ' ';
        int minCount = Integer.MAX_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) < minCount) {
                minChar = key;
                minCount = map.get(key);
            }
        }

        System.out.println("Minimum occurring character: " + minChar);
    }
}

package com.vijay.collection;
import java.util.HashMap;

public class MapIsEmpty {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map is not empty.");
        }
    }
}

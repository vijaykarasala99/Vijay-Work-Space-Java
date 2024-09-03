package com.vijay.collections;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
    	//HashSet is not a synchronized class
    	//HashSet internally follows hashtable structure where all the elements are stored using hashing technique
        // 1. Testing unique elements (no duplicates allowed)
        HashSet<Object> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("apple"); // Duplicate
        set.add(1);
        set.add(1);
        System.out.println("1. Unique Elements Test:");
        System.out.println("HashSet after adding duplicates: " + set);
        System.out.println();

        // 2. Testing if HashSet allows only one null value
        set.add(null);
        set.add(null); // Adding null again
        System.out.println("2. Null Value Test:");
        System.out.println("HashSet after adding multiple nulls: " + set);
        System.out.println();

        // 3. Testing unordered collection (insertion order not guaranteed)
        set.clear();
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");
        System.out.println("3. Insertion Order Test:");
        System.out.println("HashSet: " + set);
   
    }
}

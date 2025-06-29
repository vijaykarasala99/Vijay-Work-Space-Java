package com.vijay.collection;
import java.util.*;

public class HowToInsertNullInTreeSet {
    public static void main(String[] args) {
        // TreeSet with null-safe comparator
        TreeSet<String> set = new TreeSet<>(Comparator.nullsFirst(Comparator.naturalOrder()));

        // Adding elements including null
        set.add(null);
        set.add("Apple");
        set.add("Banana");
       
        // Displaying the TreeSet
        System.out.println("TreeSet with null: " + set);
    }
}

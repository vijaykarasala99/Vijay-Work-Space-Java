package com.vijay.collections;

import java.util.ArrayList;

public class FindSameDataInTwoArrayLists {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Date");

        // Find common elements between two ArrayLists
        list1.retainAll(list2);
       
        // Print the common elements
        System.out.println("Common elements: " + list1);
    }
}

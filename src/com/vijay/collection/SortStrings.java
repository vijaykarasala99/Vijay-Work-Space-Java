package com.vijay.collection;
import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        Collections.sort(list); // Ascending order
        System.out.println("Sorted in Ascending Order: " + list);

        Collections.sort(list, Collections.reverseOrder()); // Descending order
        System.out.println("Sorted in Descending Order: " + list);
    }
}

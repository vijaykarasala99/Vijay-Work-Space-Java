package com.vijay.collections;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListExample {

    public static void main(String[] args) {
        // ArrayList: Suitable when you need frequent access to elements
        // LinkedList: Suitable when there are frequent insertions and deletions
      
        // To Create Arraylist with size: ArrayList<Object> al = new ArrayList<>(20);
    	
    	ArrayList<Object> al = new ArrayList<>();
        al.add("Vijay");        // String
        al.add(1000);          // Integer
        al.add(100.2);        // Double
        al.add(0, "Kvijay"); // Adding at index 0
        
        // Additional elements
        ArrayList<Object> additionalElements = new ArrayList<>();
        additionalElements.add("bbbb");
        additionalElements.add("nnn");
        al.addAll(1, additionalElements); // Adding additional elements at index 1

        // Using List.of to add more elements
        al.addAll(Arrays.asList(1, "Vijay", 100.0, 2, "kkk"));

        System.out.println(al); 
        
        
    }
}

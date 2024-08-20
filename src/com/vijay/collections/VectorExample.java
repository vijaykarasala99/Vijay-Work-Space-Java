package com.vijay.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // vector is legacy bcz it is available from java 1.0
    	// vector is synchronized means thread safe
    	//synchronization ensures that only one thread can access the Vector's methods at a time, 
    	//preventing concurrent modification issues
    	
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(1, 25); // Insert 25 at index 1

        // Print the original vector
        System.out.println("Original Vector: " + vector);

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing elements
        vector.remove((Integer) 25); // Remove by value
        vector.remove(1);            // Remove by index

        // Print the vector after removal
        System.out.println("After removal: " + vector);

        // Using for-each loop to iterate over elements
        System.out.print("Iterating using for-each loop: ");
        for (Integer element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Using Iterator to traverse elements
        System.out.print("Iterating using Iterator: ");
        vector.iterator().forEachRemaining(element -> System.out.print(element + " "));
        System.out.println();

        // Check if the vector contains an element
        boolean containsElement = vector.contains(20);
        System.out.println("Contains 20: " + containsElement);

        // Get the size and capacity of the vector
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity()); // Initial capacity is usually 10
    }
}

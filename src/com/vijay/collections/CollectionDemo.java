package com.vijay.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	    
	    //Collection is an interface that defines the basic operations on a group of objects, known as elements.
		//Collections is a utility class that contains static methods to manipulate or return collections.
	
	public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        
        // Add elements to the collection
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");
        
        System.out.println("Initial Collection: " + collection);
        
        // Remove an element from the collection
        collection.remove("Banana");
        System.out.println("After removing Banana: " + collection);
        
        // Check the size of the collection
        System.out.println("Size of Collection: " + collection.size());
        
        // Check if the collection is empty
        System.out.println("Is Collection empty? " + collection.isEmpty());
        
        // Check if the collection contains an element
        System.out.println("Does Collection contain Apple? " + collection.contains("Apple"));
        
        // Iterate over the elements in the collection
        Iterator<String> iterator = collection.iterator();
        System.out.print("Collection elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
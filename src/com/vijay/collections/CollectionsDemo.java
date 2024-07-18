package com.vijay.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	
	//Collection is an interface that defines the basic operations on a group of objects, known as elements.
	//Collections is a utility class that contains static methods to manipulate or return collections.
					
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        // Add elements to the list
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        
        System.out.println("Original List: " + list);
        
        // Sort the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        
        // Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
        
        // Perform binary search on the sorted list
        Collections.sort(list); // Sort again before binary search
        int index = Collections.binarySearch(list, "Banana");
        System.out.println("Index of 'Banana': " + index);
        
        // Create a synchronized list
        List<String> synchronizedList = Collections.synchronizedList(list);
        System.out.println("Synchronized List: " + synchronizedList);
        
        // Create an unmodifiable collection
        Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(list);
        System.out.println("Unmodifiable Collection: " + unmodifiableCollection);
        
        // Try to modify the unmodifiable collection (This will throw an UnsupportedOperationException)
        try {
            unmodifiableCollection.add("Grapes");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the unmodifiable collection.");
        }
    }
}

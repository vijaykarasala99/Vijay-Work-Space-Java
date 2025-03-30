package com.vijay.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
// What Happens If You Use next() Without hasNext()?
// If you call next() without checking hasNext(), 
// and there are no more elements in the iterator, it will throw a NoSuchElementException at runtime.
        
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) { // Checks if elements exist
            System.out.println(iterator.next()); // Retrieves and prints the next element
        }
    }
}



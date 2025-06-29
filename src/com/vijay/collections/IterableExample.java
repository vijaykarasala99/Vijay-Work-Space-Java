package com.vijay.collections;

import java.util.*;
import java.util.function.Consumer;

public class IterableExample {
    public static void main(String[] args) {

    	//The Iterable interface (in java.lang) provides the following methods:
    	
    	List<String> names = Arrays.asList("Vijay", "Raj", "Anil");

        // 1. Using iterator()
        Iterator<String> itr = names.iterator();
        System.out.println("Using iterator():");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 2. Using forEach()
        System.out.println("\nUsing forEach():");
        names.forEach(name -> System.out.println(name));

        // 3. Using spliterator()
        System.out.println("\nUsing spliterator():");
        Spliterator<String> spl = names.spliterator();
        spl.forEachRemaining(System.out::println);
    }
}

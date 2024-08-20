package com.vijay.collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Comparator;

public class LinkedListExample {
    public static void main(String[] args) {
    	//Neither ArrayList nor LinkedList is synchronized by default. 
        //If you need a thread-safe list, consider using 
    	
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the list
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);

        // Print the original list
        System.out.println("Original LinkedList: " + list);

        // Add at the beginning
        list.addFirst(0);
        System.out.println("After adding at the beginning: " + list);

        // Add at the end
        list.addLast(50);
        System.out.println("After adding at the end: " + list);

        // Remove from the beginning
        list.removeFirst();
        System.out.println("After removing from the beginning: " + list);

        // Remove from the end
        list.removeLast();
        System.out.println("After removing from the end: " + list);

        // Use descendingIterator to traverse the list in reverse order
        System.out.print("List in reverse order: ");
        list.descendingIterator().forEachRemaining(value -> System.out.print(value + " "));
        System.out.println();

        // Use forEach to print each element (requires a Consumer)
        System.out.println("List elements using ForEach:");
        list.forEach(System.out::println);

        // Get a ListIterator for the list
        ListIterator<Integer> listIterator = list.listIterator();
        System.out.print("List elements using ListIterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // Get a ListIterator starting at index 0
        ListIterator<Integer> listIteratorFromIndex = list.listIterator(0);
        System.out.print("List elements using ListIterator starting at index 0: ");
        while (listIteratorFromIndex.hasNext()) {
            System.out.print(listIteratorFromIndex.next() + " ");
        }
        System.out.println();

        // Get a Spliterator
        Spliterator<Integer> spliterator = list.spliterator();
        System.out.println("Spliterator estimate size: " + spliterator.estimateSize());

        // Sort the list in natural order (Comparator.naturalOrder() for integers)
        list.sort(Comparator.naturalOrder());
        System.out.println("After sorting: " + list);
    }
}

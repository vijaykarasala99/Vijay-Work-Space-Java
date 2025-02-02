package com.vijay.collection;
import java.util.LinkedList;

public class RemoveFromLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1); // Removes element at index 1
        System.out.println("LinkedList after removal: " + list);
    }
}

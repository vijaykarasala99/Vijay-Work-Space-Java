package com.vijay.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(10);
        set.add(30);
        System.out.println("TreeSet (sorted): " + set);
        
        TreeSet<Integer> reverse = new TreeSet<>(Comparator.reverseOrder());
        reverse.add(20);
        reverse.add(10);
        reverse.add(30);
        System.out.println("TreeSet (reverse): " + reverse);
        
    }
}


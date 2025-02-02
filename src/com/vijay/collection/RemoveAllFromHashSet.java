package com.vijay.collection;
import java.util.HashSet;

public class RemoveAllFromHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        set.clear();
        System.out.println("HashSet after removing all elements: " + set);
    }
}

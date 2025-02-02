package com.vijay.collection;
import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);

        Collections.sort(list);
        System.out.println("Second largest element: " + list.get(list.size() - 2));
    }
}

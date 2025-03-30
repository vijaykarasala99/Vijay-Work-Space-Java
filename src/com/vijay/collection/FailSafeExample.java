package com.vijay.collection;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("D"); 
        }
        System.out.println("Final List: " + list);
    }
}

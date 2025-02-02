package com.vijay.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        // Fail-fast iterator
        try {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                list.add(30); // Throws ConcurrentModificationException
                it.next();
            }
        } catch (Exception e) {
            System.out.println("Fail-fast iterator exception: " + e);
        }
        // Fail-safe iterator
        CopyOnWriteArrayList<Integer> safeList = new CopyOnWriteArrayList<>(list);
        Iterator<Integer> itSafe = safeList.iterator();
        while (itSafe.hasNext()) {
            safeList.add(40); // No exception
            System.out.println(itSafe.next());
        }
    }
}


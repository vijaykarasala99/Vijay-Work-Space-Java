package com.vijay.collection;
import java.util.ArrayList;

public class ListsEqual {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);

        if (list1.equals(list2)) {
            System.out.println("The lists are equal.");
        } else {
            System.out.println("The lists are not equal.");
        }
    }
}

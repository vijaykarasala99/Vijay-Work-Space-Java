package com.vijay.collection;
import java.util.ArrayList;

public class CloneList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
        System.out.println("Cloned List: " + list2);
    }
}


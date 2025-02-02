package com.vijay.collection;
import java.util.ArrayList;
import java.util.Collections;

public class ListFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);

        int frequency = Collections.frequency(list, 10);
        System.out.println("Frequency of 10: " + frequency);
    }
}


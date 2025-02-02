package com.vijay.collection;
import java.util.ArrayList;

public class LargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);

        int largest = list.get(0);
        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest element: " + largest);
    }
}

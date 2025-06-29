package com.vijay.arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 5, 4, 5};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for (int num : arr) {
            set.add(num); // Automatically removes duplicates
        }
       
        System.out.println("After Removing Duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}

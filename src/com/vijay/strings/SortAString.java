package com.vijay.strings;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String s = "abacbagsgs";
        char arr[] = s.toCharArray();
        char temp;
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted String: " + new String(arr));
        System.out.println(Arrays.toString(arr));
    }
}

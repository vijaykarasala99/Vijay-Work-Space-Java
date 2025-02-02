package com.vijay.ait;
import java.util.Arrays;

public class SortCharacters {
    public static void main(String[] args) {
        String str = "java";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println("Sorted characters: " + new String(chars));
    }
}


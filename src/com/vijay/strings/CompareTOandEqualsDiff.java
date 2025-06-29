package com.vijay.strings;

public class CompareTOandEqualsDiff {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        //.equals() → returns true if strings are exactly equal (case-sensitive), else false.
        System.out.println("Using equals(): " + str1.equals(str2));
        //.compareTo() → returns 0 if equal, negative if first string is lexicographically smaller, positive if greater.
        System.out.println("Using compareTo(): " + str1.compareTo(str2));
    }
}


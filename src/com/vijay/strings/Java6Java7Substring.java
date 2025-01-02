package com.vijay.strings;

public class Java6Java7Substring {
    public static void main(String[] args) {
        // Java 6 behavior (memory leak example)
        String largeString = "This is a very large string";
        String smallSubstring = largeString.substring(0, 4); // Shares the char[] of largeString
        largeString = null;  // largeString's char[] won't be garbage collected
        System.out.println(smallSubstring); // Output: "This"

        // Java 7 behavior (memory-safe)
        largeString = "This is a very large string";
        smallSubstring = largeString.substring(0, 4); // Creates a new char[] for the substring
        largeString = null;  // largeString's char[] can now be garbage collected
        System.out.println(smallSubstring); // Output: "This"
    }
}



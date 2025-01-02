package com.vijay.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Reversed string: " + reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;  // Base case
        }
        return reverse(str.substring(1)) + str.charAt(0);  // Recursive call
    }
}


package com.vijay.exceptions;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        String[] memoryHog = new String[Integer.MAX_VALUE]; // Try to allocate a huge array
    }
}


package com.vijay.exception;
public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Trying to access a method on a null object." +e.getMessage());
        }
    }
}

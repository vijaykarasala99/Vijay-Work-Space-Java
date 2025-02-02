package com.vijay.exception;
public class NumberFormat {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert non-numeric string to an integer." +e.getMessage());
        }
    }
}

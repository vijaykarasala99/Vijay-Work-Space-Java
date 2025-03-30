package com.vijay.java17;

public class WithoutPatternMatching {
    public static void main(String[] args) {
        Object obj = 100;  // Change this value to test different types

        if (obj instanceof Integer) {
            Integer i = (Integer) obj; // Explicit casting needed
            System.out.println("Integer value: " + i);
        } else if (obj instanceof String) {
            String s = (String) obj; // Explicit casting needed
            System.out.println("String value: " + s);
        } else if (obj instanceof Double) {
            Double d = (Double) obj; // Explicit casting needed
            System.out.println("Double value: " + d);
        } else if (obj instanceof Boolean) {
            Boolean b = (Boolean) obj; // Explicit casting needed
            System.out.println("Boolean value: " + b);
        } else {
            System.out.println("Unknown type");
        }
    }
}

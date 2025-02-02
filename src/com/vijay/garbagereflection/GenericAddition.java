package com.vijay.garbagereflection;
public class GenericAddition {
    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(10, 20)); // Integer
        System.out.println("Sum: " + add(10.5, 20.5)); // Double
    }
}

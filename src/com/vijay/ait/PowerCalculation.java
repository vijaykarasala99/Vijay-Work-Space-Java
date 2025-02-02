package com.vijay.ait;
public class PowerCalculation {
    public static void main(String[] args) {
        int base = 2, exponent = 3;
        System.out.println(base + " raised to " + exponent + " is: " + power(base, exponent));
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
}


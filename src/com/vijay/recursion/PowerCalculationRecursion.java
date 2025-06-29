package com.vijay.recursion;

public class PowerCalculationRecursion {

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1; // base case: anything power 0 = 1
        }
        return base * power(base, exp - 1); // recursive case
    }

    public static void main(String[] args) {
        int base = 2;
        int exp = 3;
        System.out.println(base + " raised to power " + exp + " is: " + power(base, exp));
    }
}

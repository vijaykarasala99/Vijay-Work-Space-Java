package com.vijay.ait;
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // Swap using XOR
        a = a ^ b; // a now holds a XOR b
        b = a ^ b; // b becomes original a
        a = a ^ b; // a becomes original b
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

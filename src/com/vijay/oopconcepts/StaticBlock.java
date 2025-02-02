package com.vijay.oopconcepts;
public class StaticBlock {
    static {
        System.out.println("Static block executed");
    }

    static void staticMethod() {
        System.out.println("Static method executed");
    }

    public static void main(String[] args) {
        StaticBlock.staticMethod();
    }
}

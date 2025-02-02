package com.vijay.oopconcepts;
public class FinalKeyword {
    final int MAX = 100;

    final void display() {
        System.out.println("Final method called");
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
        System.out.println("MAX: " + obj.MAX);
    }
}

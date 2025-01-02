package com.vijay.oops;

public class DynamicBinding {

    // Parent class method
    void display() {
        System.out.println("Display method in Parent class");
    }}

class Derived extends DynamicBinding {

    // Overriding the display method
    @Override
    void display() {
        System.out.println("Display method in Child class");
    }}

class Main {
    public static void main(String[] args) {
        // Parent class reference holding a Parent object
        DynamicBinding parentObj = new DynamicBinding();
        parentObj.display(); // Calls Parent class method

        // Parent class reference holding a Child object
        DynamicBinding childObj = new Derived();
        childObj.display(); // Calls Child class method (Dynamic Binding)
    }
}

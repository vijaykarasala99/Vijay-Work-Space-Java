package com.vijay.oopconcepts;
public class Student {
    String name; // instance variable
    int rollNumber; // instance variable
    static String schoolName = "ABC School"; // static variable

    void display() {
        String temp = "Local Variable"; // local variable
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", School: " + schoolName + ", Temp: " + temp);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.rollNumber = 101;
        student.display();
    }
}

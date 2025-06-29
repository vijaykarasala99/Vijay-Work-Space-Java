package com.vijay.wrapper;

class Student {}

class Sample {}

class Employee {}

class Customer {}

public class ClassLoadingInMethodArea {
    public static void main(String[] args) {
    	
    	//Class represent classes and interfaces in a running Java application
        Class<?> cls = Student.class;      // Upcasting
        System.out.println(cls.getName()); // FQN (Fully Qualified Name: Package + Class Name)

        cls = Sample.class;
        System.out.println(cls.getName());

        cls = Employee.class;
        System.out.println(cls.getName());

        cls = Customer.class;
        System.out.println(cls.getName());
    }
}

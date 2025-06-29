package com.vijay.reflection;
import java.lang.reflect.Field;

class Person {
    private String name = "Vijay";
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        // Create object
        Person person = new Person();
       
        // Get the 'name' field
        Field field = person.getClass().getDeclaredField("name");

        // Make private field accessible
        field.setAccessible(true);

        // Read and print the value
        System.out.println("Original name: " + field.get(person));

        // Change the value
        field.set(person, "KARASALA");

        // Print modified value
        System.out.println("Modified name: " + field.get(person));
    }
}

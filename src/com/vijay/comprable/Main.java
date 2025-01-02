package com.vijay.comprable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(3, "Alice"),
            new Student(1, "Bob"),
            new Student(2, "Charlie")
        );
        // Using Comparable (natural ordering by ID)
        Collections.sort(students); // Uses compareTo() from Comparable
        System.out.println("Sorted by ID (Using Comparable): " + students);

        // Using Comparator (custom ordering by name)
        Comparator<Student> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
        Collections.sort(students, nameComparator); // Sorts by name
        System.out.println("Sorted by Name (Using Comparator): " + students);
  
        // Using Comparator (custom ordering by ID in descending order)
        Comparator<Student> idDescendingComparator = (s1, s2) -> s2.id - s1.id;
        Collections.sort(students, idDescendingComparator); // Sorts by ID in descending order
        System.out.println("Sorted by ID Descending (Using Comparator): " + students);
    }
}

package com.vijay.comprable;
import java.util.*;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Natural ordering by ID
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
}




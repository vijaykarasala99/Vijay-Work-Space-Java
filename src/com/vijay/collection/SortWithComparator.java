package com.vijay.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class SortWithComparator {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 35));

        Collections.sort(list, Comparator.comparingInt(p -> p.age));
        System.out.println("Sorted by Age: " + list);
    }
}

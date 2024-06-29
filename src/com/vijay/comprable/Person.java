package com.vijay.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		return 0;
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		Collections.sort(people);

		System.out.println("Sorted by age (natural order) :   ");
		for (Person person : people) {
			System.out.println(person);
		}
		
			   Collections.sort(people, new Comparator<Person>() {
				
				@Override
				public int compare(Person p1, Person p2) {
					return p1.name.compareTo(p2.name);
				}	
			});
			
			System.out.println("Sorted by name : ");
			for (Person person : people) {
				System.out.println(person);
			}					
}
}








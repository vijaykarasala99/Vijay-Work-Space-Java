package com.vijay.oopconcepts;

public class Student1 {

	String name = "John";

	public String toString() {
		return "Student name: " + name;
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
	}
}
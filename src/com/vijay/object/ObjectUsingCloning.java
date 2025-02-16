package com.vijay.object;

// Using clone()method in Cloning concept we can create object
// Used to create a copy of an existing object. The class must implement Cloneable.
// 1.Implement Cloneable interface.
// 2.Override clone() method.
// 3.Use super.clone() to duplicate the object.

class Student implements Cloneable {
	void displayStudent() {
		System.out.println("Displaying StudentNo1: VIJAY");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectUsingCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		s1.displayStudent();
		// cloning here
		Student s2 = (Student) s1.clone();
		s2.displayStudent();
	}
}

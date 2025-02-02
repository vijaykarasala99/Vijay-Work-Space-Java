package com.vijay.oopconcepts;

public class InstanceofOperator {
	public static void main(String[] args) {
		Animal1 animal = new Dog1();
		System.out.println(animal instanceof Dog1); // true
		System.out.println(animal instanceof Animal1); // true
	}
}

class Animal1 {
}

class Dog1 extends Animal1 {
}

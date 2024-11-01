package com.vijay;

interface QuestionInterface {
	default void display() {
		System.out.println("Interface Display Method...");
	}
}

class QuestionClass {
	 public void display() {
		System.out.println("Class Display Method...");
	}
}

public class Test extends QuestionClass implements QuestionInterface {
	public static void main(String[] args) {
		new Test().display();
	}
}
//The Test class inherits the display() method from QuestionClass, 
//which takes precedence over the default method in QuestionInterface.
//Therefore, the display() method from QuestionClass is executed



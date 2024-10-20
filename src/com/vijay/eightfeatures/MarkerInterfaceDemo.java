package com.vijay.eightfeatures;
//A user-defined marker interface tags classes for special handling, allowing you to check with instanceof  
//and apply specific behavior without needing any methods.

interface MyMarkerInterface {

}

class MyClass implements MyMarkerInterface {
	public void display() {
		System.out.println("My Class display Method...");
	}
}

public class MarkerInterfaceDemo {
	public static void main(String[] args) {
		MyClass myObj = new MyClass();
		if (myObj instanceof MyMarkerInterface) {
			System.out.println("The obj Belongs to MyMarkerInterface....");
			myObj.display();
		} else {
			System.out.println("The obj Doesnot Belongs to MyMarkerInterface!!!");
		}
	}
}
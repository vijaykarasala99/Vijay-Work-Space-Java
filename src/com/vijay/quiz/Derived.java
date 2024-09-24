package com.vijay.quiz;

public class Derived extends Base {
	public static void show() {
		System.out.println("Derived:: show() called");
	}

	public static void main(String[] args) {
		Derived d = new Derived();
		d.show();
		
		Base b = new Base();
		b.show();
		
		((Base) new Derived()).show();

		Base bb = new Derived();
		bb.show();
	}
}

//output: 
//Base:: show() called
//Base:: show() called
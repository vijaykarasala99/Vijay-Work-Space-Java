package com.vijay.cloudgen;

public class Derived extends Base{
//	public void show() {
//		System.out.println("Derived:: show() called");
//	}

	public static void main(String[] args) {
		Derived d=new Derived();
		d.show();
       ((Base) new Derived()).show();
	}

}

//output: 
//Base:: show() called
//Base:: show() called

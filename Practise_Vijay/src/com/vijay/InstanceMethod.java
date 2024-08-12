package com.vijay;

public class InstanceMethod {
	
	    int a;
	    static double b;

	    public int instanceMethod() {
	        // Instance variables can be accessed in instance methods
	        System.out.println("Instance var in instance method: " + a);
	        
	        // Static variables can be accessed in instance methods
	        System.out.println("Static var: " + b);
	        return 0;
	    }

	    public static void main(String[] args) {
	        // Static variable can be accessed in static methods
	        System.out.println("Static var: " + b);

	        // Instance variables can't be accessed directly in static methods
	        // Un-commenting the next line will cause a compilation error
	        // System.out.println(a);

	        // To access instance variables in a static method, we need to create an instance of the class
	        InstanceMethod example = new InstanceMethod();
	        System.out.println("Instance var through object: " + example.a);
	        
	        // Call the instance method
	        example.instanceMethod();
	    }
}

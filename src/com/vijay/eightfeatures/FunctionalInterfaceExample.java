package com.vijay.eightfeatures;

@FunctionalInterface
interface MyFunctionalInterface {

	void displayMessage(); // Single abstract method

}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
    	 // Using lambda expression to implement the functional interface
        MyFunctionalInterface msg = () -> System.out.println("My Message is Vijay Karasala");
        msg.displayMessage();
    }
}


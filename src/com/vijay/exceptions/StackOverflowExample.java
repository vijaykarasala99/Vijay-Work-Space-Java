package com.vijay.exceptions;

public class StackOverflowExample {

	// StackOverflowError occurs when a method calls itself recursively
	 public static void main(String[] args) {
	        recursiveMethod();
	    }

	    public static void recursiveMethod() {
	        recursiveMethod(); // This will cause StackOverflowError
	    }
	}
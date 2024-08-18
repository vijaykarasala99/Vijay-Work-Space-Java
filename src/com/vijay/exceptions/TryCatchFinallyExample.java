package com.vijay.exceptions;

public class TryCatchFinallyExample {
	
    public static void main(String[] args) {
    	try {
       int a=10/0;
       System.out.println("Result: "  +a);
    	}catch(Exception e) {
    		System.out.println( "Exception Caught: "  +e.getMessage());
    		e.printStackTrace();
    	}finally {
    		System.out.println("the given number not divided by zero");
    	}
    
    }
}
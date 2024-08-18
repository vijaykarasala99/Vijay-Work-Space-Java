package com.vijay.exceptions;
public class VotingEligibilityExample {
    
    static class AgeExceptionByVijay extends Exception {
    	//serialVersionUID: A unique identifier used to ensure that a serialized object can be properly deserialized.
		private static final long serialVersionUID = 1L;
		public AgeExceptionByVijay(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        int age = 16; 
        try {
                if (age < 18) {
                throw new AgeExceptionByVijay("You must be 18 or older to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (AgeExceptionByVijay e) {
            System.out.println("AgeExceptionByVijay caught: " + e.getMessage());
        }
}}

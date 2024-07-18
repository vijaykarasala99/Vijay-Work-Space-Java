package com.vijay.exceptions;

public class CheckedExceptionExample {
	public static void main(String[] args) {
        try {
            Class.forName("com.vijay.exceptions.CheckedExceptionExampl");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

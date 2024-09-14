package com.vijay.exceptions;

public class CheckedExceptionExample {
	public static void main(String[] args) {
        try {
            Class.forName("com.vijay.exceptions.CheckedExceptionExample");
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}

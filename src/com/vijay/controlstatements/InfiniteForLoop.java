package com.vijay.controlstatements;

public class InfiniteForLoop {

	public static void main(String[] args) {
//the for loop has no conditions or increments, which makes it run infinitely
		for (;;) {
			System.out.println("This will run forever!");
		}
	}
}

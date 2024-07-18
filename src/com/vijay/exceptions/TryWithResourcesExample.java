package com.vijay.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		// The try-with-resources statement in Java is used to automatically close
		// resources that are used within the try block.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter a line: ");
			String input = br.readLine();
			System.out.println("You entered: " + input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

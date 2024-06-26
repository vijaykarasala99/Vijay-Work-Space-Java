package com.vijay.eightfeatures;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("lambda started");
		new Thread(runnable).start();

		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.forEach(lang -> System.out.println("Language: " + lang));

		System.out.println("Example 3: Lambda expression with functional interface");
		MyCalculator calculator = (a, b) -> a + b;
		int result = calculator.calculate(10, 5);
		System.out.println("Result: " + result);
	    }

	// Functional interface for example 3
	    interface MyCalculator {
		int calculate(int a, int b);

	}
}
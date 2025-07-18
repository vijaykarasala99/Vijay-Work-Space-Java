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
		MyCalculator add = (a, b) -> a + b;
		System.out.println(add.calculate(10, 20));
	}

	// Functional interface for example 3
	interface MyCalculator {
		int calculate(int a, int b);

	}
}
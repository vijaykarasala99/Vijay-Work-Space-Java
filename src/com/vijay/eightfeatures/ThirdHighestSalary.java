package com.vijay.eightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employe {

	private Double salary;

	public Employe(Double salary) {
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}

public class ThirdHighestSalary {

	public static void main(String[] args) {
		List<Employe> empSalaries = Arrays.asList(
			new Employe(45000.0),
			new Employe(67000.0),
			new Employe(56000.0),
			new Employe(67000.0),
			new Employe(82000.0),
			new Employe(30000.0)
		);

		Optional<Double> thirdHighest = empSalaries.stream()
			.map(Employe::getSalary)
			.distinct()
			.sorted(Comparator.reverseOrder())
			.skip(2)
			.findFirst();

		if (thirdHighest.isPresent()) {
			System.out.println("Third Highest Salary: " + thirdHighest.get());
		} else {
			System.out.println("Third Highest Not Found!!!");
		}
	}
}

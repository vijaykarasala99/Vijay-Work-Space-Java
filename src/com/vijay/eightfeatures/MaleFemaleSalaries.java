package com.vijay.eightfeatures;

import java.util.*;
import java.util.stream.Collectors;

class employee {
	
    private String name;
    private String gender;
    private double salary;
    private String org;

    public employee(String name, String gender, double salary, String org) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.org = org;
    }

    public String getGender() { return gender; }
    public double getSalary() { return salary; }
    public String getOrg() { return org; }

    @Override
    public String toString() {
        return name + " - " + gender + " - " + salary + " - " + org;
    }
}

public class MaleFemaleSalaries {
    public static void main(String[] args) {
        List<employee> employees = Arrays.asList(
            new employee("John", "Male", 50000, "OrgA"),
            new employee("Alice", "Female", 60000, "OrgA"),
            new employee("Bob", "Male", 55000, "OrgB"),
            new employee("Diana", "Female", 65000, "OrgB"),
            new employee("Raj", "Male", 48000, "OrgA"),
            new employee("Sara", "Female", 70000, "OrgA")
        );

        // Male Salaries Ascending
        List<Double> maleSalariesAsc = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("male"))
            .map(employee::getSalary)
            .sorted()
            .collect(Collectors.toList());

        // Female Salaries Descending
        List<Double> femaleSalariesDesc = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("female"))
            .map(employee::getSalary)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        System.out.println("Male Salaries Ascending: " + maleSalariesAsc);
        System.out.println("Female Salaries Descending: " + femaleSalariesDesc);
    }
}



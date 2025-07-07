package com.vijay.eightfeatures;

import java.util.*;
import java.util.stream.Collectors;
class EmployeeDataRecord {
    String name;
    int age;
    int salary;

    public EmployeeDataRecord(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - " + age + " - " + salary;
    }
}
public class EmployeeSalaryAnalytics {
    
	public static void main(String[] args) {
        List<EmployeeDataRecord> list = new ArrayList<>();

        list.add(new EmployeeDataRecord("Ram", 23, 20000));
        list.add(new EmployeeDataRecord("Ashok", 25, 60000));
        list.add(new EmployeeDataRecord("Suresh", 33, 25000));
        list.add(new EmployeeDataRecord("Charan", 26, 40000));

        Double avgSalary = list.stream()
                               .collect(Collectors.averagingInt(p -> p.getSalary()));
        System.out.println("Avg Salary : " + avgSalary);

        Optional<EmployeeDataRecord> minSalary = 
        		list.stream()
                    .collect(Collectors.minBy(Comparator.comparing(EmployeeDataRecord::getSalary)));
        System.out.println("Minimum Salary Employee: " + minSalary.get());

        Optional<EmployeeDataRecord> maxSalary = 
        		list.stream()
                    .collect(Collectors.maxBy(Comparator.comparing(EmployeeDataRecord::getSalary)));
        System.out.println("Maximum Salary Employee: " + maxSalary.get());
    }
}


package com.vijay.oopconcepts;
public class University {
    class Department {
        void showDepartment() {
            System.out.println("Computer Science Department");
        }
    }
    public static void main(String[] args) {
        University uni = new University();
        Department dept = uni.new Department();
        dept.showDepartment();
    }
}

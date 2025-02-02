package com.vijay.oopconcepts;
public abstract class Employee {
    abstract void work();
    abstract void salary();

    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.work();
        emp.salary();
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager is working");
    }

    void salary() {
        System.out.println("Manager's salary is 50000");
    }
}

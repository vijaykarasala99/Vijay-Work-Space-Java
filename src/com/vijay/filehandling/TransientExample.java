package com.vijay.filehandling;
import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    transient double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            Employee emp = new Employee("John", 50000);
            oos.writeObject(emp);
            System.out.println("Object serialized with transient field.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee emp = (Employee) ois.readObject();
            System.out.println("Deserialized Employee: " + emp.name + ", " + emp.salary);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

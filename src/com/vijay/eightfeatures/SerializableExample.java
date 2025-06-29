package com.vijay.eightfeatures;
import java.io.*;

class Employz implements Serializable {
    private static final long serialVersionUID = 1L; // recommended for Serializable classes
    String name;
    int age;
    String department;

    public Employz(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

public class SerializableExample {
    public static void main(String[] args) {
    	Employz employee = new Employz("John Doe", 30, "Engineering");

        // Serialize the employee object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(employee);
            System.out.println("Employee serialized: " + employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the employee object from the file
        Employz deserializedEmployee = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            deserializedEmployee = (Employz) ois.readObject();
            System.out.println("Employee deserialized: " + deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

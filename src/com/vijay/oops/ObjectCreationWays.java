package com.vijay.oops;

import java.io.*;
import java.lang.reflect.Constructor;

// Main class containing everything
public class ObjectCreationWays {

    // Inner Student class
    static class Student implements Cloneable, Serializable {
        int id = 101;
        String name = "Vijay";

        public Student() {
            System.out.println("Student Constructor Called");
        }

        public String toString() {
            return id + " - " + name;
        }

        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) throws Exception {

        // 1. Using Class.forName().newInstance()
        Student s1 = (Student) Class.forName("com.vijay.oops.ObjectCreationWays$Student").newInstance();
        System.out.println("Using Class.forName: " + s1);

        // 2. Using clone()
        Student s2 = (Student) s1.clone();
        System.out.println("Using clone(): " + s2);

        // 3. Using Constructor.newInstance()
        Constructor<Student> constructor = Student.class.getConstructor();
        Student s3 = constructor.newInstance();
        System.out.println("Using Constructor.newInstance(): " + s3);

        // 4. Using Deserialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
        out.writeObject(s3);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
        Student s4 = (Student) in.readObject();
        in.close();
        System.out.println("Using Deserialization: " + s4);
    }
}

/**


package com.vijay.object;
import java.io.*;
import java.lang.reflect.Constructor;

// A simple class with a message
class MyObject implements Cloneable, Serializable {
    public void showMessage() {
        System.out.println("Object created: " + this);
    }

    // For clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCreationDemo {
    public static void main(String[] args) {
        try {
            // 1. Using new keyword
            // Most common way to create an object in Java
            MyObject obj1 = new MyObject();
            obj1.showMessage();

            // 2. Using Class.forName()
            // Dynamically load the class and create instance
            MyObject obj2 = (MyObject) Class.forName("MyObject").getDeclaredConstructor().newInstance();
            obj2.showMessage();

            // 3. Using clone() method
            // Requires class to implement Cloneable and override clone()
            MyObject obj3 = (MyObject) obj1.clone();
            obj3.showMessage();

            // 4. Using deserialization
            // Object is written to a file and then read back (object creation via I/O)
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            oos.writeObject(obj1);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
            MyObject obj4 = (MyObject) ois.readObject();
            ois.close();
            obj4.showMessage();

            // 5. Using Reflection with Constructor class
            // Getting the constructor and invoking newInstance
            Constructor<MyObject> constructor = MyObject.class.getConstructor();
            MyObject obj5 = constructor.newInstance();
            obj5.showMessage();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



*/



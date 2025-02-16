package com.vijay.object;
import java.io.*;

class MyExample implements Serializable {
   
	private static final long serialVersionUID = 1L;

	void show() {
        System.out.println("Object created using Deserialization!");
    }
}

public class ObjectUsingDeserialization { 
    public static void main(String[] args) throws Exception {
        // Serialization
        MyExample obj1 = new MyExample();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
        out.writeObject(obj1);
        out.close();

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));
        MyExample obj2 = (MyExample) in.readObject();
        in.close();

        obj2.show();
    }
}

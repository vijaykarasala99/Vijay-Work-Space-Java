package com.vijay.object;
public class ObjectCountFind {
    
	static int objectCount = 0;

    public ObjectCountFind() {
        objectCount++;
    }
    public static void main(String[] args) {
        ObjectCountFind obj1 = new ObjectCountFind();
        ObjectCountFind obj2 = new ObjectCountFind();
        ObjectCountFind obj3 = new ObjectCountFind();

        System.out.println("Total objects created: " + objectCount);
    }
}

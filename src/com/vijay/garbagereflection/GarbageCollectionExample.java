package com.vijay.garbagereflection;

public class GarbageCollectionExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected!");
    }

    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        obj1 = null; // Eligible for garbage collection

        // Suggest JVM to run garbage collection
        System.gc();

        // Adding a small delay to see the GC output
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


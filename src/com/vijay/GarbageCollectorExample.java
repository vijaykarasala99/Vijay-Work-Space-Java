package com.vijay;

public class GarbageCollectorExample {

	public static void main(String[] args) {
		 // Creating objects
		GarbageCollectorExample obj1 = new GarbageCollectorExample();
		GarbageCollectorExample obj2 = new GarbageCollectorExample();
        
        // Nullifying the reference variables
        obj1 = null;
        obj2 = null;
        
        // Suggesting garbage collection
        System.gc();

        // Output message to confirm program execution
        System.out.println("Garbage Collection requested by System.gc().");
       
        Runtime.getRuntime().gc();
        System.out.println("Garbage Collection requested by Runtime class.");


    }
    
    // Override finalize method to see when an object is garbage collected
    @Override
    protected void finalize() {
        System.out.println("Garbage collector called on object: " + this);
    }
}



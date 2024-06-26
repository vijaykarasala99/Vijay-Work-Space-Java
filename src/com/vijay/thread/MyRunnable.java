package com.vijay.thread;

public class MyRunnable implements Runnable {

	    @Override
	    public void run() {
	    System.out.println("Running in thread: " + Thread.currentThread().getId());
	    }
    
        public static void main(String[] args) {
        
    	MyRunnable myRunnable = new MyRunnable();
       
        // Creating a Thread object and passing MyRunnable instance
        Thread thread = new Thread(myRunnable);
        
        // Calling start method
        thread.start(); // This will create a new thread and run the task in that new thread

        // Calling run method directly
        myRunnable.run(); // This will run the task in the main thread
      
        
 }}

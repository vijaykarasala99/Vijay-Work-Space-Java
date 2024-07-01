package com.vijay;

public class ThreadingExample {
	
	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread();
	    thread.start();
	    thread.setPriority(1);
	    //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, 
	    //1 second is equal to 1000 milliseconds
	    
	    Thread.sleep(1000);
		System.out.println(thread.hashCode());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		System.out.println(thread.getName());
		System.out.println(thread.getThreadGroup());
		System.gc();
	}
}
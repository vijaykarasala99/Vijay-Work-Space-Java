package com.vijay.thread;

public class MyThread extends Thread {

	// we can create thread by extending Thread class or by implementing Runnable
	// interface

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		
	    th.run();
		
	    System.out.println(th + "   :is running");
	    System.out.println(th.getId());
	    System.out.println(th.getPriority());
	   
	
		/*
		 run Method: Invokes the task in the current thread. It’s just a normal method
		 call and does not start a new thread.
		 
		 start Method: Starts a new thread, and within that new thread, it calls the
		 run method to execute the task. This is the correct way to initiate a new
		 thread	 
	   */
}
}

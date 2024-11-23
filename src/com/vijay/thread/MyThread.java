package com.vijay.thread;

public class MyThread extends Thread {

	// we can create thread by extending Thread class or by implementing
	// Runnable-interface
	public static void main(String[] args) throws InterruptedException {
		MyThread th = new MyThread();
		th.start();

		// A Thread object can only be started once; calling start() again on the same
		// thread will throw an IllegalThreadStateException.
		// th.start();

		synchronized (th) {
			th.wait(5000);
			// Normally you would call notify() from a different thread,
			// but for the sake of this example, it's shown here.
			th.notify();
		}
		System.out.println(th + "   :is running");
		System.out.println(th.getId());
		System.out.println(th.getPriority());

		/*
		 * run Method: Invokes the task in the current thread. It’s just a normal method
		 * call and does not start a new thread.
		 * 
		 * start Method: Starts a new thread, and within that new thread, it calls the
		 * run method to execute the task. This is the correct way to initiate a new
		 * thread
		 */
	}
}

package com.vijay.thread;

public class ThreadPriorities {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("T1"));
		Thread t2 = new Thread(() -> System.out.println("T2"));

		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.MAX_PRIORITY); // 10

		t1.start();
		t2.start();

	}
}

/**
📝 Thread Priority in Java
🔹 Thread priority determines the order in which threads are scheduled for execution by the JVM thread scheduler.
➡️ It is only a hint, not a guarantee — actual behavior depends on the underlying Operating System.
🔹 Priority Range in Java:
Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5   // ✅ Default priority
Thread.MAX_PRIORITY = 10
*/


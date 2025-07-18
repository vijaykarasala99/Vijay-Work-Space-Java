package com.vijay.thread;

public class RunnableWithLambda {
	public static void main(String[] args) {
		Runnable task = () -> {
			System.out.println("Thread running using lambda: " + Thread.currentThread().getName());
		};
		Thread th = new Thread(task);
		th.start();
	}
}

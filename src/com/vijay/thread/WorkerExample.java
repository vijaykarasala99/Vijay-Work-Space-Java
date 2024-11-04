package com.vijay.thread;

public class WorkerExample {
	// n Java, the volatile keyword is used for variables to ensure that changes
	// made by one thread are immediately visible to other threads
	private volatile boolean running = true;

	public void startWorker() {
		Thread worker = new Thread(() -> {
			while (running) {
				System.out.println("Working...");
				// Simulate work with sleep
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println("Worker stopped.");
		});
		worker.start();
	}

	public void stopWorker() {
		running = false; // Flag updated to stop the worker thread
	}

	public static void main(String[] args) throws InterruptedException {
		WorkerExample example = new WorkerExample();
		example.startWorker();

		// Let it run for a few seconds
		Thread.sleep(3000);

		// Now stop the worker thread
		example.stopWorker();
	}
}

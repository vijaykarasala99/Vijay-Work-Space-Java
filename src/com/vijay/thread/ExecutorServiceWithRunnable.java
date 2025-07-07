package com.vijay.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceWithRunnable {
 public static void main(String[] args) {
	 
     ExecutorService service = Executors.newFixedThreadPool(2);

     Runnable task1 = () -> System.out.println("Task 1");
     Runnable task2 = () -> System.out.println("Task 2");

     service.execute(task1);
     service.execute(task2);

     service.shutdown();
 }
}

package com.vijay.eight;
public class ThreadWithLambda {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello from Lambda thread!");
        Thread thread = new Thread(task);
        thread.start();
    }
}

package com.vijay.multithread;
public class ThreadLifecycleExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread Running...");
                Thread.sleep(1000);
                System.out.println("Thread Finished...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Thread State: " + t.getState());
        t.start();
        System.out.println("Thread State After Start: " + t.getState());
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread State After Completion: " + t.getState());
    }
}

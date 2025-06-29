package com.vijay.multithread;

public class DeadlockResolved {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        // Thread 1 — locks in order
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 locked lock1");
                synchronized (lock2) {
                    System.out.println("Thread 1 locked lock2");
                }
            }
        });

        // Thread 2 — lock in same order to avoid deadlock
        Thread t2 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 2 locked lock1");
                synchronized (lock2) {
                    System.out.println("Thread 2 locked lock2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}


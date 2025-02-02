package com.vijay.multithread;
public class JoinThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}

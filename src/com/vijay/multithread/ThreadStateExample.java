package com.vijay.multithread;
public class ThreadStateExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
                System.out.println("Thread Running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Before start: " + t.getState());
        t.start();
        System.out.println("After start: " + t.getState());

        try {
            Thread.sleep(100);
            System.out.println("While sleeping: " + t.getState());
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join: " + t.getState());
    }
}

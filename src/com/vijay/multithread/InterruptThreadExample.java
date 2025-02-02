package com.vijay.multithread;
public class InterruptThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Running...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        });

        t.start();
        t.interrupt();
    }
}

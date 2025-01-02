package com.vijay.strings;

public class ThreadSafeStringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Initial");

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (sb) {
                sb.append(" - Thread 1");
                System.out.println(sb.toString());
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (sb) {
                sb.append(" - Thread 2");
                System.out.println(sb.toString());
            }
        });

        thread1.start();
        thread2.start();
    }
}

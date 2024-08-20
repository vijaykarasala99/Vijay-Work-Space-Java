package com.vijay.collections;

import java.util.Collections;
import java.util.Vector;

public class SynchronizedVectorExample {
    public static void main(String[] args) {
        // Create a Vector instance
        Vector<Integer> vector = new Vector<>();
       
        // Create two threads that will access the vector concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                vector.add(i);
                System.out.println("Thread1 added: " + i);
                try {
                     Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                vector.add(i);
                System.out.println("Thread2 added: " + i);
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Sort and Print the final content of the vector
        Collections.sort(vector);
        System.out.println("Final Vector: " + vector);
    }
}

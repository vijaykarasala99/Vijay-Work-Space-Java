package com.vijay.thread;
public class MovieExample {
    public static void main(String[] args) throws InterruptedException {
        Thread download = new Thread(() -> {
            System.out.println("🎥 Movie downloading...");
            try {
                Thread.sleep(2000); // Simulate time to download
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("✅ Movie downloaded");
        });

        download.start();  // Start downloading
        download.join();   // Main waits here till download finishes
        System.out.println("🍿 Now watching the movie");
    }
}
//  ✅ Exact purpose of join() in Java:
//  join() makes the main thread wait until the current thread finishes execution.


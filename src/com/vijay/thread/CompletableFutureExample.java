package com.vijay.thread;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10 + 20);

        future.thenAccept(result -> System.out.println("Result: " + result));

        // Wait briefly so async task completes before main thread ends
        try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

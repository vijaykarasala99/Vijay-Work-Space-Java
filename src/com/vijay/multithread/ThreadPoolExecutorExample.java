package com.vijay.multithread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            final int task = i;
            executor.execute(() -> System.out.println("Executing Task " + task));
        }

        executor.shutdown();
    }
}

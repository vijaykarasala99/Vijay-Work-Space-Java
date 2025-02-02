package com.vijay.multithread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        for (int i = 1; i <= 5; i++) {
            final int taskNum = i;
            executor.execute(() -> System.out.println("Executing Task " + taskNum));
        }

        executor.shutdown();
    }
}


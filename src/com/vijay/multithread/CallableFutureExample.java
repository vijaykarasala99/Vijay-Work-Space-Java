package com.vijay.multithread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask implements Callable<String> {
    public String call() {
        return "Task executed using Callable!";
    }
}

public class CallableFutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyTask());

        try {
            System.out.println("Result: " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        executor.shutdown();
    }
}

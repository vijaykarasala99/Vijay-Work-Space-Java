package com.vijay.thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 10 + 20;

        Future<Integer> future = service.submit(task);

        System.out.println(future.get()); // waits and prints 30

        service.shutdown();
        
    }
}

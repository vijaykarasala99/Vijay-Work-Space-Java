package com.vijay.thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceWithCallable {
 public static void main(String[] args) throws Exception {
     ExecutorService service = Executors.newSingleThreadExecutor();

     Callable<Integer> task = () -> 10 + 20;
     Future<Integer> future = service.submit(task);

     int result = future.get();           // waits for result
     System.out.println(result);          // prints 30

     service.shutdown();
 }
}

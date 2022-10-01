package com.javainterview.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable {
    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer randomNumber = random.nextInt(5);
        Thread.sleep(5000);
        return randomNumber;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] futureTasks = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            Callable callable = new CallableExample();
            futureTasks[i] = new FutureTask(callable);
            Thread thread = new Thread(futureTasks[i]);
            thread.start();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(futureTasks[i].get());
        }
    }
}

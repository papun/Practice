package src.executrDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Task());

        executorService.shutdown();
    }
}

class Task implements Runnable {
    public void run() {
        System.out.println("Hello");
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Hi");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

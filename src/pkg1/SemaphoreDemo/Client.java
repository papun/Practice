package src.pkg1.SemaphoreDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 100; i++) {
                int finalI = i;
                executorService.submit(() -> {
                    Connection.getConnection().connect();
                    System.out.println(Thread.currentThread().getName() + ":" + finalI);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                });
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executorService != null)
                executorService.shutdown();
        }

    }
}

package src.pkg1.SemaphoreDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService=null;
        try {
            executorService = Executors.newCachedThreadPool();
            for (int i = 0; i < 300; i++) {
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {

                       Connection.getConnection().connect();

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

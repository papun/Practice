package src.revision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 100; i++) {
            int k = i;
            Runnable task = () -> {
                String s = getSymbol(k);
                System.out.println(Thread.currentThread().getName() + s);
            };
            service.execute(task);
        }
        service.shutdown();
    }

    public static String getSymbol(int i) {
        return "Hello" + i;
    }
}

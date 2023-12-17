package src.pkg4;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> intList1 = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        for (int i = 0; i < intList1.size(); i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + ":" + finalI);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executorService.shutdown();
    }
}


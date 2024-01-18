package src.pkg2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class IncreaseValue {
    static int i=0;

    static synchronized void increment(){
        i=i+1;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.rangeClosed(0, 1000).forEach(i -> {
            System.out.println(i);
            executorService.submit(IncreaseValue::increment);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();


        IntStream.rangeClosed(0,10).forEach(System.out::println);


    }
}

package src.pkg2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class IncreaseValue {
    static int i=0;

    static synchronized void increment(){
        i=i+1;
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        IntStream.rangeClosed(0,1000).forEach(i-> executorService.execute(IncreaseValue::increment));
        Thread.sleep(100);
        System.out.println(i);
        executorService.shutdown();


        IntStream.rangeClosed(0,10).forEach(System.out::println);


    }
}

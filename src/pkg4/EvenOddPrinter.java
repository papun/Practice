package src.pkg4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddPrinter {
    public static void main(String[] args) {
        int n = 100;

        NumberPrinter numberPrinter = new NumberPrinter(n);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(() -> {
            try {
                numberPrinter.printOdd(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            try {
                numberPrinter.printEven(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
    }
}

class NumberPrinter {
    private final int n;
    private int counter;

    public NumberPrinter(int n) {
        this.n = n;
        this.counter = 1;
    }

    public synchronized void printOdd(String name) throws InterruptedException {
        while (counter <= n) {
            while (counter % 2 == 0) {
                wait();
            }
            if (counter <= n) {
                System.out.println("Thread : " + name + ":" + counter);
                counter++;
                notify();
            }
        }
    }

    public synchronized void printEven(String name) throws InterruptedException {
        while (counter <= n) {
            while (counter % 2 != 0) {
                wait();
            }
            if (counter <= n) {
                System.out.println("Thread : " + name + ":" + counter);
                counter++;
                notify();
            }
        }
    }
}

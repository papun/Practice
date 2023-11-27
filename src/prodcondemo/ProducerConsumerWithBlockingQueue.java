package src.prodcondemo;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.Thread.sleep;

public class ProducerConsumerWithBlockingQueue {

    static ArrayBlockingQueue<Object> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

    }

    private static void consume() throws InterruptedException {
        while (true) {
            sleep(2000);
            Integer take = (Integer) queue.take();
            System.out.println("Consumed: " + take);
        }
    }

    private static void produce() throws InterruptedException {
        Random random = new Random();
        while (true) {
            sleep(2000);
            int produced = random.nextInt(100);
            queue.put(produced);
            System.out.println("Produced: " + produced);
        }
    }
}

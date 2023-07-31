package pkg1.SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class Client1 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10,false);
        try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        System.out.println(semaphore.availablePermits());
    }
}

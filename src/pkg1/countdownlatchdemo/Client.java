package pkg1.countdownlatchdemo;

import java.util.concurrent.CountDownLatch;

public class Client {
    public static void main(String[] args) {
        CountDownLatch cdl1=new CountDownLatch(1);
        CountDownLatch cdl2=new CountDownLatch(1);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("First Thread");
                cdl1.countDown();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cdl1.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Second Thread");
                cdl2.countDown();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cdl2.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Third Thread");
            }
        });

        t1.start();t2.start();t3.start();
    }
}

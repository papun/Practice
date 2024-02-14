package src.pkg1.DeadlockDemo;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main is Starting...");

        String lock1="A";
        String lock2="B";

        Thread t1 = new Thread(() -> {
                synchronized (lock1){
                    try {
                        System.out.println("Got Lock1 from Thread 1");
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (lock2){
                        System.out.println("Got Lock2 from Thread 1");
                    }
                }

        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    System.out.println("Got Lock2 from Thread 2");
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("Got Lock1 from Thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

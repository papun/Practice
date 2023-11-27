package src.deadlockdemo;

public class Test {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        Thread t1 = new Thread(() -> {
            synchronized (a) {
                try {
                    Thread.sleep(10);
                    System.out.println("Got a from t1");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (b) {
                    System.out.println("Got b from t1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                try {
                    Thread.sleep(10);
                    System.out.println("Got b from t2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (a) {
                    System.out.println("Got b from t2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

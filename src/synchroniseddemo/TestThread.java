package src.synchroniseddemo;

class MultiThread {

    public void printCount() {
        try {
            for (int i = 0; i < 5; i++) System.out.println("Value of I is :" + i);
        } catch (Exception e) {
            System.out.println("Exception Occurred.");
        }
    }
}

class Thread extends MultiThread {
    Thread t;
    MultiThread mt;
    String threadName;


    Thread(MultiThread mt, String name) {
        this.mt = mt;
        this.threadName = name;
    }

    public void run() {
//        synchronized (mt){
        printCount();
//        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting Thread :" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.run();
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        MultiThread mt = new MultiThread();
        Thread t1 = new Thread(mt, "Thread-1");
        Thread t2 = new Thread(mt, "Thread-2");

        t1.start();
        t2.start();


    }
}

package src.revision;

import java.util.concurrent.TimeUnit;


class PrintNumbers {
    int MAX = 10;

    public static void main(String[] args) {
        PrintNumbers p = new PrintNumbers();
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= p.MAX; i += 2) {
                System.out.println("Odd Thread Name : " + Thread.currentThread().getName() + ":" + i);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= p.MAX; i += 2) {
                System.out.println("Even Thread Name : " + Thread.currentThread().getName() + ":" + i);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        evenThread.setPriority(1);
        oddThread.setPriority(2);
        evenThread.start();
        oddThread.start();


    }
}

//class EvenPrinter implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 2; i <= MAX; i += 2) {
//            System.out.println("Even Thread Name : "+Thread.currentThread().getName()+":" + i);
//
//            try {
//                // Adding a small delay for better visibility
//
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class OddPrinter implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= MAX; i += 2) {
//            System.out.println("Odd Thread Name : "+Thread.currentThread().getName()+":" + i);
//
//            try {
//                // Adding a small delay for better visibility
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


package pkg1;

import java.util.concurrent.CountDownLatch;

class Foo extends Thread{

    public Foo() {

    }

    CountDownLatch cdl1=new CountDownLatch(1);
    CountDownLatch cdl2= new CountDownLatch(1);


    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        cdl1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        cdl1.await();
        printSecond.run();
        cdl2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        cdl2.await();
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        int[] i ={2,1,3};
        Runnable r1 = new Runnable() {
            @Override
            public void run() {

                System.out.println("One");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {

                System.out.println("Two");
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {

                System.out.println("Three");
            }
        };
        for (int j = 0; j < 3; j++) {
            switch (i[j]){
                case 1:
                    new Foo().first(r1);
                    break;
                case 2:
                    new Foo().second(r2);
                    break;
                case 3:
                    new Foo().third(r3);
                    break;
            }
        }

        Thread t1 = new Thread();

        Thread t2 = new Thread();


    }
}
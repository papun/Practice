package pkg1;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private final String src;
    private final String tgt;
    public Task(String src,String tgt){
        this.src=src;
        this.tgt=tgt;
    }
    @Override
    public void run() {
        try {
            IoUtils.copyFile(src,tgt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        String srcFile1 = "a.txt";
        String srcFile2 = "b.txt";

        String dstFile1= "c.txt";
        String dstFile2 = "d.txt";
        long start = System.currentTimeMillis();

//        pack1.IoUtils.copyFile(srcFile1,dstFile1);
//        pack1.IoUtils.copyFile(srcFile2,dstFile2);


//        Thread t1 = new Thread(new pack1.Task(srcFile1,dstFile1));
//        Thread t2 = new Thread(new pack1.Task(srcFile2,dstFile2));
//        t1.start();
//        t2.start();
//
//        long end = System.currentTimeMillis();
//        System.out.println("Total Time : " +
//                (end - start) + "ms");

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new Task(srcFile1,dstFile1));
        executorService.execute(new Task(srcFile2,dstFile2));

//        executorService.shutdown();
//        executorService.shutdownNow();
    }


}

package pkg1;

import java.util.concurrent.*;

class MyMath {
    static int add(int x,int y){
        return x+y;
    }
}

class MyTask implements Callable<Integer>{

    int x;
    int y;
    public MyTask(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public Integer call() throws Exception {
        return x+y;
    }
}

public class Main2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
//        Future<Integer> future = executor.submit(new pack1.MyTask(15, 20));
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return MyMath.add(9,9);
            }
        });
        future.isDone();
        int z = future.get();
        System.out.println(z);
    }
}

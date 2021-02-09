package com.ss.threads.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        MyRunnable[] jobs={new MyRunnable("Thread1"),
                new MyRunnable("Thread2"),
                new MyRunnable("Thread3"),
                new MyRunnable("Thread4"),
                new MyRunnable("Thread5"),
                new MyRunnable("Thread6")};

        ExecutorService service=Executors.newFixedThreadPool(3);

        for(Runnable r:jobs){
            service.submit(r);

        }
        //service.shutdownNow()
        service.shutdown();

    }
}


class MyRunnable implements Runnable{

    String name;

    MyRunnable(String name){
        this.name=name;
    }


    @Override
    public void run() {
        System.out.println(name+" Stared "+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" Finishing "+Thread.currentThread().getName());


    }
}

package com.ss.threads.countdownlatch;

import sun.awt.Mutex;

import java.util.concurrent.CountDownLatch;



public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cl=new CountDownLatch(10);
        Demo demo[]=new Demo[10];
        for (int i=0;i<10;i++){
            demo[i]=new Demo(cl);
        }
        for (int i=0;i<10;i++){
            new Thread(demo[i]).start();
        }
         cl.await();
        System.out.println("Main method");

    }
}



class Demo implements Runnable{
    CountDownLatch cl;
    Demo(CountDownLatch cl){
        this.cl=cl;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing latch down"+cl.getCount());
        cl.countDown();
    }
}

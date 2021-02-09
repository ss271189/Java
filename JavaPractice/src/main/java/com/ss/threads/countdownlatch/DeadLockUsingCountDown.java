package com.ss.threads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DeadLockUsingCountDown extends Thread{

    static CountDownLatch cl;

    public static void main(String[] args) throws InterruptedException {
        cl=new CountDownLatch(1);

        DeadLockUsingCountDown d=new DeadLockUsingCountDown();
        d.start();

        cl.await();



    }

    @Override
    public void run() {

        System.out.println("Deadlock");

    }
}

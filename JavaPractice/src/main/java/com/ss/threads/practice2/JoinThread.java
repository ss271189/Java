package com.ss.threads.practice2;

public class JoinThread implements Runnable {


    @Override
    public void run() {
        System.out.println("Child Thread");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException ie){
            System.out.println("Exception");
        }
        System.out.println("Child Thread finished");
    }
}

package com.ss.threads.practice2;

public class MainTest {

    public static void main(String[] args) {
        Thread t= new Thread(new JoinThread());
        Thread t1= new Thread(new JoinThread());
        t.start();
        t1.start();

        try{
            t.join();
            t1.join();
            System.out.println("Main Thread");
            Thread.sleep(5000);
        } catch (InterruptedException ie ){

        }
        System.out.println("Finishing main thread");
    }
}

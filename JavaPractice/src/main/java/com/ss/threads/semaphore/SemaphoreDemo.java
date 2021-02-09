package com.ss.threads.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    int count=0;

    public static void main(String[] args) {
        SemaphoreDemo sd=new SemaphoreDemo();
        Semaphore s=new Semaphore(1);
        Runnable r=new PrintEven(sd,s);
        Runnable r1=new PrintOdd(sd,s);
        Thread t=new Thread(r);
        Thread t1=new Thread(r1);
        t.start();
        t1.start();
    }

}



class PrintEven implements Runnable{
    SemaphoreDemo obj;
    Semaphore s;

    PrintEven(SemaphoreDemo obj, Semaphore s){
        this.obj=obj;
        this.s=s;
    }

    @Override
    public void run() {

        while(true){
            System.out.println("Even 1");
            if(obj.count%2==0){
                System.out.println("Even 2");
                try {
                    s.acquire();
                    System.out.println("Even 3");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Even 4");
                System.out.println("Odd Thread"+obj.count++);
                System.out.println("Even 5");
                s.release();
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}


class PrintOdd implements Runnable{

    SemaphoreDemo obj;
    Semaphore s;

    PrintOdd(SemaphoreDemo obj, Semaphore s){
        this.obj=obj;
        this.s=s;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Odd 1");
             if(obj.count%2!=0){
                 try {
                     System.out.println("Odd 2");
                     s.acquire();
                     System.out.println("Odd 3");
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("Odd 4");
                 System.out.println("Odd Thread"+obj.count++);
                 System.out.println("Odd 5");
                  s.release();
             } else {
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
        }
    }
}

package com.ss.threads.daemonthread;

public class DaemonThreadDemo1 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true); Can not change Daemon nature of thread after starting RE: IllegalThreadStateException
        MyThread1 t=new MyThread1();
        System.out.println(t.isDaemon());
        //t.setDaemon(true);
        t.start();
        System.out.println(t.isDaemon());
        //float f = 12.3f;
    }

}

// As we have set child thread as Daemon . Hence it will die as soon as the main thread dies

class MyThread1 extends Thread{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

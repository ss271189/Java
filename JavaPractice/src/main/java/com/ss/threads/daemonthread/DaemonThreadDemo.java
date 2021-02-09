package com.ss.threads.daemonthread;

public class DaemonThreadDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true); Can not change Daemon nature of thread after starting RE: IllegalThreadStateException
        MyThread t=new MyThread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }

}


class MyThread extends Thread{

}

package com.ss.threads.threadgroup;

public class ThreadGroupDemo1 {

    public static void main(String[] args) {
        ThreadGroup g1=new ThreadGroup("MyGroup");
        Thread t1=new Thread(g1,"t1");
        Thread t2=new Thread(g1,"t2");
        g1.setMaxPriority(3);
        Thread t3=new Thread(g1,"t3");
        //t3.setUncaughtExceptionHandler();

        System.out.println("T1 priority "+t1.getPriority());
        System.out.println("T2 priority "+t2.getPriority());
        System.out.println("T3 priority "+t3.getPriority());
        g1.list();
        System.out.println(g1.activeCount());

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        Thread.currentThread().getThreadGroup().getParent().list();



    }

}


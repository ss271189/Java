package com.ss.threads.threadgroup;

public class ThreadGroupDemo {


    public static void main(String[] args) {
        ThreadGroup g1=new ThreadGroup("FristGroup");
        System.out.println(g1.getParent().getName());
        ThreadGroup g2=new ThreadGroup(g1,"FristGroup");
        System.out.println(g2.getParent().getName());

    }

}

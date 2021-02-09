package com.ss.threads.practice2;

public class Practice1 extends Thread{

    /*@Override
    public void run() {
        System.out.println("Run");
    }*/

    public void start(){
        System.out.println("Start");
    }

    static public  void main(String[] args) {
        Practice1 p1=new Practice1();
        Practice1 p2=new Practice1();
     //p1

    }
}


package com.ss.threads.practice1;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintEven extends Thread{

    AtomicBoolean ab;
    PrintEven(AtomicBoolean ab){
        this.ab=ab;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i+=2){
            if(!ab.get()){
                System.out.println(i);
                ab.set(true);
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

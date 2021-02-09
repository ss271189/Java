package com.ss.threads.practice1;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintOdd extends Thread {

    AtomicBoolean ab;
    PrintOdd(AtomicBoolean ab){
        this.ab=ab;
    }

    @Override
    public void run() {
       for (int i=0;i<10;i++){
           if(ab.get()){
               System.out.println(i);
               ab.set(false);
               try {
                   sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }

    }
}

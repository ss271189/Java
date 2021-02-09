package com.ss.threads.interthreadcommunication;

public class OddEven {

    public static void main(String[] args) {
        Printer p=new Printer();
        Thread t=new Thread(new PrintEven(p));
        Thread t1=new Thread(new PrintOdd(p));

        t.start();
        t1.start();

    }

}


class Printer{
    int a=0;
    boolean flag=true;

    synchronized void printEven() throws InterruptedException {
        while(true){
            if(!flag){
                wait();
            } else {
                System.out.println("Even "+a);
                a++;
                flag=false;
                notify();
            }
        }
    }
    synchronized  void printOdd() throws InterruptedException {
        while(true){
            if(flag){
                wait();
            } else {
                System.out.println("Odd "+a);
                a++;
                flag=true;
                notify();
            }
        }
    }
}

class PrintEven implements Runnable{

    Printer p;

    PrintEven(Printer p){
        this.p=p;
    }

    @Override
    public void run() {
        try {
            p.printEven();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



class PrintOdd implements Runnable{

    Printer p;

    PrintOdd(Printer p){
        this.p=p;
    }

    @Override
    public void run() {
        try {
            p.printOdd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


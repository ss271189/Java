package com.ss.threads.threadlocal;

public class ThreadLocalDemo3 {

    public static void main(String[] args) {
        ParentThread pt=new ParentThread();
        pt.start();
    }

}

class ParentThread extends Thread{

    public static InheritableThreadLocal it=new InheritableThreadLocal(){
        @Override
        public Object childValue(Object p){
            return "CC";
        }
    };

    public void run(){
        it.set("pp");
        System.out.println(it.get());
        ChildThread ct=new ChildThread();
        ct.start();


    }

}

class ChildThread extends  Thread{


    public void run(){
        System.out.println(ParentThread.it.get());
    }
}

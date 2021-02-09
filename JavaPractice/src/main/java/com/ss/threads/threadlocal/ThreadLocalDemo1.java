package com.ss.threads.threadlocal;

public class ThreadLocalDemo1 {

    public static void main(String[] args) {
        ThreadLocal tl=new ThreadLocal(){

            @Override
            public Object initialValue(){
                return "Initial Value";
            }
        };
        System.out.println(tl.get());
        tl.set("Shashank");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());

    }
}

package com.ss.threads.practice1;

public class SingletonTest {

    private static SingletonTest sTest;

    private SingletonTest(){

    }
    public static SingletonTest getInstance(){
        if(sTest!=null){
            return sTest;
        } else {
            synchronized (sTest){
                if(sTest==null){
                    sTest=new SingletonTest();
                }
            }  return sTest;
        }
    }
}

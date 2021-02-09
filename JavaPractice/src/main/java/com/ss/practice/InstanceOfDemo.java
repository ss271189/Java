package com.ss.practice;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
        //System.out.println(t instanceof String); // Compile Time Error
        System.out.println(null instanceof String); //false


    }
}

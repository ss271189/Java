package com.ss.java8.refrences;

import com.ss.threads.reentrantlock.Test;

interface Interf{
    public void m();
}


public class MethodRefDemo {

    public static void m1(){
        System.out.println("Static method");
    }

    public void m2(){
        System.out.println("Non -Static method");
    }


    public static void main(String[] args) {

        Interf i=MethodRefDemo::m1;
        MethodRefDemo notStaticDemo=new MethodRefDemo();
        Interf i2=notStaticDemo::m2;
        i.m();
        i2.m();

    }


}

package com.ss.basic.innerclass;

public class Demo1 {

    public void m1(){

        Inner i=new Inner();
        i.m2();

    }


    class Inner {

        public void m2(){
            System.out.println("Here");

            m1();

        }

    }

}

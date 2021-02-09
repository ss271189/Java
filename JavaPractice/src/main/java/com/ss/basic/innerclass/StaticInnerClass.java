package com.ss.basic.innerclass;

public class StaticInnerClass {

    int a;

    public void display(){
        //System.out.println(b); no

    }

    static class InnerClass{
        int b;


        public void display(){
            //System.out.println(a); can not refer non static \
        }

    }

}

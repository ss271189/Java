package com.ss.practice;

import java.util.function.Predicate;

public class VarArgsDemo {


    public static void sum(int b,int... a){
        System.out.println("Here");
    }
    public static void sum(int b,int a){
        System.out.println("Here1");
    }

   /* public static void sumPrint(String... a,int b){

    }*/

    public static void main(String... args) {
        sum(10,20,30);
        sum(10,20);
    }


}

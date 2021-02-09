package com.ss.basic.inheritance;

public class Inherit1 {

    public static void main(String[] args) {
       // new P();
        new C();
    }

}


class P {
    P(){
        System.out.println("P");

    }
}


class C extends P
{
    C(){

        System.out.println("C");

    }
}
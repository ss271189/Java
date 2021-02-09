package com.ss.java8.refrences;

class Sample{
    Sample(){
        System.out.println("Constructer");
    }
}
interface Interf1{
    public Sample m();
    int a =5;
}

public class ConstructorRefDemo {

    public static void main(String[] args) {
        Interf1 i=Sample::new;
        i.m();

    }


}

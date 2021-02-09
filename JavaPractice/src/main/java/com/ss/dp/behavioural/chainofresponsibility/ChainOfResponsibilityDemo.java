package com.ss.dp.behavioural.chainofresponsibility;

public class ChainOfResponsibilityDemo {


    public static void main(String[] args) {
        int x=10/0;
        Manager h1=new Manager();
        Director h2=new Director();
        Ceo h3=new Ceo();

        h1.setHandler(h2);
        h2.setHandler(h3);


        h1.handleRequest(2500);

    }



}

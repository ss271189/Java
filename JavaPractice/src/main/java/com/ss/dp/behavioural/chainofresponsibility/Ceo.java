package com.ss.dp.behavioural.chainofresponsibility;

public class Ceo implements Handler {

    Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(int cost) {
     System.out.println("Your request has been successfully approved by CEO");
    }
}

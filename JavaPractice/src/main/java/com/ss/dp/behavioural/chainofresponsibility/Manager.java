package com.ss.dp.behavioural.chainofresponsibility;

public class Manager implements Handler {

    Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(int cost) {
        if(cost<=1000){
            System.out.println("Your request has been successfully approved by Manager");
        } else{
            handler.handleRequest(cost);
        }
    }
}

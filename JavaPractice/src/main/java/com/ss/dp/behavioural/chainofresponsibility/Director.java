package com.ss.dp.behavioural.chainofresponsibility;

public class Director implements Handler {

    Handler handler;


    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(int cost) {
        if(cost<=2000){
            System.out.println("Your request has been successfully approved by Director");
        } else{
            handler.handleRequest(cost);
        }

    }
}

package com.ss.java8.defaultmethod;

public class Car implements Engine,TapeRecorder {

    // Compile time error override conflicted method


    @Override
    public void start() {

        Engine.super.start(); // To call engine start method
        TapeRecorder.super.start();// To call Table recorder start methiod

    }
}

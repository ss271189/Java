package com.ss.java8.defaultmethod;

public interface TapeRecorder {

    default void start(){
        System.out.println("I am playing music");
    }
}

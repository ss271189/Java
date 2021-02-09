package com.ss.java8.defaultmethod;

public interface Engine {

    default void start(){
        System.out.println("I am driving car");
    }
}

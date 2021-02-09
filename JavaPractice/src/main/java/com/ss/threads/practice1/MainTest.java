package com.ss.threads.practice1;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainTest {

    public static void main(String[] args) {
        AtomicBoolean ab=new AtomicBoolean(false);
        //ab=AtomicBoolean.;

        PrintEven printEven=new PrintEven(ab);
        PrintOdd printOdd=new PrintOdd(ab);
        printEven.start();
        printOdd.start();
    }
}

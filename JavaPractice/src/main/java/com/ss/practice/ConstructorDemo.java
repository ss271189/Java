package com.ss.practice;

public class ConstructorDemo {

    String s;
    int age;

    public ConstructorDemo() {
        this.s = "Shoshana";
    }


    public ConstructorDemo(String s, int age) {
        this.s = s;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorDemo obj=new ConstructorDemo();

    }


}

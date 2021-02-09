package com.ss.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaPrac1 {

    public static void main(String[] args) {
        System.out.println("Shashank ");

        List list=new ArrayList();
        list.add("Hello");
        list.add("Hello1");

        list.stream().forEach((i)->System.out.println(i));
        list.forEach((k)-> System.out.println(k));



    }

}

package com.ss.java8.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> c= x-> System.out.println(x);
        c.accept("Shashank");



        Consumer<Integer> c1= x-> System.out.println(x*2);
        Consumer<Integer> c2= x-> System.out.println(x*3);
        Consumer<Integer> c3= x-> System.out.println(x*2);

        c1.andThen(c2).andThen(c3).accept(2);

        System.out.println("==================BiConsumer==================");
        BiConsumer<String,String> bc=(x,y)-> System.out.println(x+", Mr/Mrs "+y);
        bc.accept("Good morning","Shashank");

    }


}

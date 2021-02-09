package com.ss.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> f=str-> str.length();

        System.out.println(f.apply("Shashank"));



        Function<Integer,Integer> f1=x->x+x;
        Function<Integer,Integer> f2=x-> x*x*x;

        System.out.println(f1.andThen(f2).apply(2));  // first f1 and then f2
        System.out.println(f1.compose(f2).apply(2));  // first f2 and then f1


        Function<Integer,Integer> f3=Function.identity() ;

        System.out.println(f3.apply(2)); // it will return the same value

        System.out.println("--------------------Bi Function-----------------------------");
        BiFunction<Integer,Integer,Integer> bf=(x,y)->x+y;
        System.out.println(bf.apply(2,4));



    }


}

package com.ss.java8.streams.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {


    public static void main(String[] args1) {

        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7);

        // Flavour 1
        Optional reduceResult=l.stream().reduce((a, b)->a+b);
        System.out.println("Sum"+reduceResult.get());

        //Flavour 2
        int result=l.stream().reduce(0,(a, b)->a+b);
        System.out.println(result);

        //Flavour 3
        int result1=l.parallelStream().reduce(10,(a, b)->a+b,(a, b)->a+b);
        System.out.println(result1);


    }
}

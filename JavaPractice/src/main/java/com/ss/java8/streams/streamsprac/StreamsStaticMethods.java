package com.ss.java8.streams.streamsprac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsStaticMethods {

    public static void main(String[] args) {

        int a[]=new int[]{1,2,3,4,5,6};

        Stream s=Stream.of(a);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        Stream s1=Stream.of(list);
        s1.forEach(System.out::println);

        Stream.generate(()-> Math.random()).limit(5).forEach(System.out::println);


        Stream.iterate(1,x->x+2).limit(5).forEach(System.out::println);




    }

}

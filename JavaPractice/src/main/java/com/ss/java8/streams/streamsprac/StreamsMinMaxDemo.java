package com.ss.java8.streams.streamsprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMinMaxDemo {

    public static void main(String[] args) {

        System.out.println(IntStream.range(1,100).filter(x-> x%2==0).max().getAsInt());

        System.out.println(IntStream.range(1,100).filter(x-> x%2==0).min().getAsInt());

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println(list.stream().max((x,y)-> x.compareTo(y)).get());


    }
}

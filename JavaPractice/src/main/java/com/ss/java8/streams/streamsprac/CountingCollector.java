package com.ss.java8.streams.streamsprac;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingCollector {

    public static void main(String[] args) {


        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,10).filter(x-> x%2==0).count());
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,10).filter(x-> x%2==0).collect(Collectors.counting()));




    }

}

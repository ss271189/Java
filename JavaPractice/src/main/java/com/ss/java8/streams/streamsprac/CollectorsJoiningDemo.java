package com.ss.java8.streams.streamsprac;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsJoiningDemo {

    public static void main(String[] args) {

        System.out.println(Stream.of("ERam","Shayam","Mohan").collect(Collectors.joining()));
        System.out.println(Stream.of("ERam","Shayam","Mohan").collect(Collectors.joining("-")));
        System.out.println(Stream.of("ERam","Shayam","Mohan").collect(Collectors.joining("-","[","]")));




    }



}

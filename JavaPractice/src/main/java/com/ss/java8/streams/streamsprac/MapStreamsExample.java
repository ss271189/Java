package com.ss.java8.streams.streamsprac;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamsExample {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();

        map.put("A","Asho9k11");
        map.put("A1","Ashok9");
        map.put("A2","Ashok8");
        map.put("A3","Ashok7");
        map.put("A5","Ashok6");
        map.put("A6","Asho6k");

        map.entrySet().stream().forEach(System.out::println);


        //Collectors.toMap()


    }


}

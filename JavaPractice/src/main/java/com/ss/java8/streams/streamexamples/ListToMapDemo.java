package com.ss.java8.streams.streamexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class ListToMapDemo {
    public static void main(String[] args) {
        List l=new ArrayList<Integer>();
        for (Integer i=0;i<10;i++)
            l.add(i);
        //l.stream().
       Map map=new HashMap();
       map= (Map) l.stream().collect(Collectors.toMap(i->i, i->i));
       System.out.println(map);


    }


}

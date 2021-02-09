package com.ss.java8.streams.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7);
        //System.out.println(l.stream().filter(x->x%2==0));
        System.out.println(l.stream().filter(x->x%2==0).collect(Collectors.toList()));

        l.stream().allMatch(i->i%1==0);
        System.out.println(l.stream().allMatch(i->i%1==0));

        System.out.println(l.stream().anyMatch(i->i==7));


        //int avg=l.stream().collect(Collectors.averagingInt(value -> ));





    }
}

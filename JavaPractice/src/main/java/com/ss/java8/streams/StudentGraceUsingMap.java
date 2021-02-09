package com.ss.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGraceUsingMap {

    public static void main(String[] args) {
        List<Integer> grades=Arrays.asList(73,67,38,33);

        List<Integer> list=grades.stream().map(x->{
            if(x<38)
                return x;
            else {
                 if(x%5>2)
                     return x+(5-(x%5));
                 else
                     return x;
            }
        }).collect(Collectors.toList());

        System.out.println(list);

    }
}

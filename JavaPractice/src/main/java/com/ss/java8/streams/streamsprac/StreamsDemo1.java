package com.ss.java8.streams.streamsprac;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {

    public static void main(String[] args) {


        List<String> act= Arrays.asList("A","B");
        List<String> act1= Arrays.asList("AD","BE","A");

        List<Student> sList=new ArrayList<>();
        sList.add(new Student("Shashank",act));
        sList.add(new Student("Saurabh",act1));


        System.out.println(sList.stream().collect(Collectors.toMap(Student::getName,Student::getActivities)));


        System.out.println(sList.stream()
                .map(s->s.getActivities())
                .flatMap(List::stream)
                .collect(Collectors.toList()));


        List<String> activities=sList.stream()
                .map(s->s.getActivities())
                .flatMap(List::stream)
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());

        Map<String,List<Student>> map=new HashMap<>();
        sList.stream().forEach(s-> s.getActivities().stream().forEach(activity-> {
            map.computeIfAbsent(activity, k-> new ArrayList<>()).add(s);
        }));
        System.out.println("-----------------------");

        System.out.println(map);






    }


}

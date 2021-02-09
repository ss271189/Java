package com.ss.java8.streams;


import jdk.nashorn.internal.objects.annotations.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

    public static void main(String[] args) throws InterruptedException {


        Long a =383983969L;
        Long sum=0L;

        for (int i=0;i<1000;i++){
           sum+=Long.valueOf(a);
        }
        System.out.println(sum);




    }

    @Override
    protected void finalize(){
        System.out.println("finalize");
    }


}

class Emp {

    public String name;
    public int age;
    public int sal;


    public Emp(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
}

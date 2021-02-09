package com.ss.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {

        List<Emp> l=new ArrayList();
        l.add(new Emp("s1",20,5000));
        l.add(new Emp("s2",30,5000));
        l.add(new Emp("s3",40,5000));
        l.add(new Emp("s4",50,5000));
        l.add(new Emp("s5",60,5000));

        List l1=l.stream().map(item->{ if (item.age>=40) return item.name; else return "no"; }).collect(Collectors.toList());
        List l2=l.stream().filter(item->{ if (item.age>=40) return true; else return false; }).collect(Collectors.toList());
        List l3=l.stream().flatMap((item)-> Stream.of(item.age>40)).collect(Collectors.toList());


        System.out.println(l3.toString());





    }
}

class C1 {
    public void display1() {
        System.out.println("Hello");
    }
}


class C2 extends C1 {

    public void display() {
        System.out.println("Hello");

    }
    public String display(String s) {
        return "Hello";

    }


}

class Emp {

    public Emp(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    String name;
    int age;
    int sal;


}

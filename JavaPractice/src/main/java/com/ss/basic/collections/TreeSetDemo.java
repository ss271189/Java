package com.ss.basic.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyCompatartor());
        t.add(2);
        t.add(10);
        System.out.println(t);
     }
}

class MyCompatartor implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

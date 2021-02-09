package com.ss.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList();

        list.add(1);
        list.add(2);
        System.out.println(list.stream().max(Integer::compareTo));
        System.out.println(list);
    }
}

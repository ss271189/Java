package com.ss.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String s="abc";
        Map<String,Integer> map=new HashMap<>();
        map.put(s,1);
        System.out.println(map.containsKey(s));

    }
}

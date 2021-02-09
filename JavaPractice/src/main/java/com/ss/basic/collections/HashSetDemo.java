package com.ss.basic.collections;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet set=new HashSet();
        System.out.println(set.add("A"));
        System.out.println(set.add("A"));

        HashMap map=new HashMap();
        System.out.println(map.put("A",1));
        System.out.println(map.put("A",2));

        System.out.println(map);


    }



}

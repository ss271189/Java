package com.ss.basic.collections;

import java.util.IdentityHashMap;

public class IdentityHasMapDemo {

    public static void main(String[] args) {

        IdentityHashMap map=new IdentityHashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        map.put(i1,"Shashank");
        map.put(i2,"Saurabh");
        System.out.println(map.get(i2));

    }
}

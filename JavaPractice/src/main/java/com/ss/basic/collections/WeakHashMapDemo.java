package com.ss.basic.collections;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        WeakHashMap map=new WeakHashMap();
        IteratorDemo d=new IteratorDemo();
        map.put(d,"Sauirabh");
        System.out.println(map);
        d=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("Map "+map);
    }
}

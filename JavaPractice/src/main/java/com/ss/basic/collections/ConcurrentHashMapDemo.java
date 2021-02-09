package com.ss.basic.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap map=new ConcurrentHashMap();
        map.put(101,"Sha");
        map.put(102,"Sau");
        map.putIfAbsent(101,"shanky");
        System.out.println(map);
        map.replace(101,"sdd","sjsjsjs");
        map.remove(102,"Saup");
        System.out.println(map);
        map.remove(102,"Sau");
        System.out.println(map);

        
    }

}



package com.ss.genrics;

import java.util.ArrayList;

public class GenricsDemo1 {

    public static void main(String[] args) {
        //Generic Area
        ArrayList<String> l=new ArrayList<String>();
        l.add("ABC1");
        System.out.println(l);
        m1(l);
        System.out.println(l);


    }

    public static void m1(ArrayList l){
        //Non generic Area :- Behaviour of generic object will be same as non generic
        l.add(10);
        l.add("ABC");
        l.add(null);
    }
}

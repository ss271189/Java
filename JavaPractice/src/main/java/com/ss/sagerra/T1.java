package com.ss.sagerra;

import java.util.Set;
import java.util.TreeSet;

public class T1 {

    int a=10;
    public static void main(String[] args) {
        Integer i1=new Integer(25);
        Integer i2=new Integer(25);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        Set<Name> obj=new TreeSet<>();



        obj.add(Name.A);
        obj.add(Name.S);
        obj.add(Name.B);
        obj.add(Name.S);
        for(Name d:obj){
            System.out.println(d);
        }

    }


}



enum Name {


    A,S,B,J
}

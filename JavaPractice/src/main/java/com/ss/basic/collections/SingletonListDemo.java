package com.ss.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        for (int i=0;i<10;i++)
            list.add(i);

        List list1=Collections.singletonList(list);

        //list1.add(11);
        System.out.println(list1.get(1));
     //   list1=list;


    }
}

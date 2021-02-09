package com.ss.basic.collections;

import java.util.*;

public class ListIteratorDemo {

    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        ListIterator<Integer> itr=list.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next()+" "+itr.previousIndex()+" Next Index"+itr.nextIndex());
        }


    }

}

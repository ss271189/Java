package com.ss.basic.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

   int i;
   String s;



    public static void main(String[] args) {

        final List l=new ArrayList<Integer>();

        for (int i=0;i<=10;i++){
            l.add(i);
        }

        Iterator<Integer> itr=l.iterator();
        while(itr.hasNext()){
            int k=itr.next();
            l.add(22);
            if(k%2==0)
                System.out.println(k);
            else
                itr.remove(); // one new methods introduced compared to Enumeration
        }
        System.out.println(l);
    }
}


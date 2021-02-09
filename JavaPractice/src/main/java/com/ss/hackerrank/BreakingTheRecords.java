package com.ss.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BreakingTheRecords {


    static void breakingRecords(int[] scores) {
        AtomicInteger a=new AtomicInteger(0);
        AtomicInteger b=new AtomicInteger(0);
        AtomicInteger c=new AtomicInteger(scores[0]);
        AtomicInteger d=new AtomicInteger(scores[0]);

        Arrays.stream(scores).forEach(x-> {
            if(x>c.get()){
                a.getAndAdd(1);
                c.getAndSet(x);
            }
            if( x<d.get()){
                b.getAndAdd(1);
                d.getAndSet(x);
            }

        });
        System.out.println(a.get());
        System.out.println(b.get());

    }

    public static void main(String[] args) {
        breakingRecords(new int[]{3,4,21,36,10,28,35,5,24,42});
    }

}

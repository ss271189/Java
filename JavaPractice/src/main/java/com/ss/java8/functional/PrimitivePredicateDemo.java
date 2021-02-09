package com.ss.java8.functional;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateDemo {

    public static void main(String[] args) {

        IntPredicate p= x-> x%2==0;
        System.out.println(p.test(2));

        LongPredicate lp= d-> d% 2==0;
        System.out.println(lp.test(2));


        DoublePredicate dp=d-> d%2.0==0;
        System.out.println(dp.test(2.0));





    }
}

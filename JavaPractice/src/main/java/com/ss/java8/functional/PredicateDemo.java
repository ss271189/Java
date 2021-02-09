package com.ss.java8.functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> p=x->x>10;
        System.out.println(p.test(5));
        System.out.println(p.test(11));
        System.out.println("=========================================");
        Predicate<Integer> p1=p.negate();
        System.out.println(p1.test(5));
        System.out.println(p1.test(11));
        System.out.println("=========================================");
        Predicate<Integer> p3=x->x%2==0;
        Predicate<Integer> p4=x->x>10;
        Predicate<Integer> p5=p3.and(p4);
        System.out.println(p5.test(12));
        System.out.println(p5.test(11));
        System.out.println("=========================================");
        Predicate<Integer> p6=p3.or(p4);
        System.out.println(p5.test(11));
        System.out.println("=========================================");

        Predicate<String> p7=Predicate.isEqual("Shashank");


        System.out.println("============BIPREDICATE=============================");
        BiPredicate<Integer,Integer> bp=(x,y)->x%y==0;

        System.out.println(bp.test(4,2));
        System.out.println(bp.test(4,3));





    }



}

package com.ss.hackerrank;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoListProblem {

    public static int getTotalX(List<Integer> a, List<Integer> b)
    {
        int count=0;
        OptionalInt max=a.stream().mapToInt(v->v).max();
        OptionalInt min=b.stream().mapToInt(v->v).min();

        BiPredicate<Integer,Integer> bp=(x,y)-> {
            if(x%y==0)return  true;
            else return false;
        };

        boolean flag=true,flag1=true;
        for(int i=max.getAsInt();i<=min.getAsInt();i++){
            flag=true;flag1=false;
            for(int z:a){
                if(!bp.test(i,z)) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                flag1=true;
                for(int z:b){
                    if(!bp.test(z,i)) {
                        flag1=false;
                    }

                }
            }
            if(flag1) count++;

        }
        return count;
    }



    public static void main(String[] args) {


        System.out.println(getTotalX(Arrays.asList(2,4),Arrays.asList(16,32,96)));

    }

}

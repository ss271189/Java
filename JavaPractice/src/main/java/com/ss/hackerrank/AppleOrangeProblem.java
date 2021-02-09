package com.ss.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class AppleOrangeProblem {


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {


        List<Integer> appleList = Arrays.stream(apples).boxed().collect(Collectors.toList());
        List<Integer> orangesList = Arrays.stream(oranges).boxed().collect(Collectors.toList());
        long appleCount=appleList.stream().map(x->x+a).filter(x->x>=s&&x<=t).count();
        long orangeCount=orangesList.stream().map(x->x+b).filter(x->x>=s&&x<=t).count();
        System.out.println(appleCount);
        System.out.println(orangeCount);




    }

    public static void main(String[] args) {
        int a[]={-2,2,1};
        int b[]={5,-6};
        countApplesAndOranges(7,11,5,15,a,b);
    }

}

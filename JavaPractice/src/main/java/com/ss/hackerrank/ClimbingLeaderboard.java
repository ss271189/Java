package com.ss.hackerrank;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ClimbingLeaderboard {


    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int p = scores.length;
        int q = alice.length;
        int ranks[] = new int[q];
        int rank=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<p;i++){
            if(!map.containsKey(scores[i])){
                map.put(scores[i],++rank);
            }
        }
        System.out.println(map);
        for(int i=0;i<q;i++){
           if(map.containsKey(alice[i])) {
            ranks[i]=map.get(alice[i]);
           } else {
              if(map.lowerKey(alice[i])!=null){
                  ranks[i]=map.get(map.lowerKey(alice[i]));
              } else {
                  ranks[i]=map.get(map.higherKey(alice[i]))+1;
              }
           }
        }
        return ranks;
    }

    public static void main(String[] args) {
        climbingLeaderboard(new int[]{100,100,50,40,40,20,10},new int[]{5,25,50,120});
    }
}

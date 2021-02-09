package com.ss.sagerra;

import java.lang.reflect.Array;

public class T2 {


    static int[] maxReach(int[] Heights){

        int[] retArray=new int[Heights.length];
        for(int i=0;i<Heights.length;i++){
           int hops=0;
           int nextDst=i;
           for(int j=i+1;j<Heights.length;j++){
               if(Heights[nextDst]<Heights[j]){
                   hops++;
                   nextDst=j;
               }

           }
           retArray[i]=hops;
           hops=0;
        }
        return retArray;
    }

    public static void main(String[] args) {
        maxReach(new int[]{1,2,2,3,1});
    }

}

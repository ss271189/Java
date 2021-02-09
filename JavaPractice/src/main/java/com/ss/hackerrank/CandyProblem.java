package com.ss.hackerrank;

public class CandyProblem {


    static long candies(int n, int[] arr) {
       long count=1l;

       long candyArray[]=new long[n];
       candyArray[0]=1;
       for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                candyArray[i]=candyArray[i-1]+1;
                count=count+candyArray[i];
            } else {
                candyArray[i]=1;
                count++;
            }

        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i-1]){
                candyArray[i]=candyArray[i+1]+1;
                count=count+candyArray[i];
            } else {
                candyArray[i]=1;
                count++;
            }

        }

       for (long l:candyArray)
           System.out.print(l+" ");

        System.out.println();




        return count;
    }


    public static void main(String[] args) {
       int arr[]={2,
               4,
               2,
               6,
               1,
               7,
               8,
               9,
               2,
               1};
        System.out.println(candies(10,arr));
    }
}


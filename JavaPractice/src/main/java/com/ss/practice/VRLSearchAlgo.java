package com.ss.practice;

import java.util.HashMap;
import java.util.Map;

public class VRLSearchAlgo {

    static Map<String,String> map=new HashMap<>();

    static{
        map.put("1","1");
        map.put("12","12");
        map.put("123","123");
        map.put("1234","1234");
        map.put("12345","12345");
        map.put("123456","123456");
        map.put("1234567","1234567");
        map.put("12345678","12345678");
        map.put("123456789","12345789");
    }

    public static String searchKey(String target){
        String bestMatch="";
        int low=0;
        int high=target.length()-1;
        int mid;
        while(low<=high){
            System.out.println("Iteration count");
            mid=(low+high)/2;
            String subString=target.substring(0,mid+1);
            if(map.containsKey(subString)){
                bestMatch=subString;
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return bestMatch;
    }

    public static void main(String[] args) {
        System.out.println(searchKey("123456789335679"));
    }





}

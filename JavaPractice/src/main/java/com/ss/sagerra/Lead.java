package com.ss.sagerra;

import java.io.IOException;

public class Lead {

    public static void main(String[] args) {
        int ret=new Lead().testMethod();
        System.out.println(ret);
    }



    public int testMethod(){
        int i=0;
        try{
            i=100/0;
            return i;

        } catch (Exception ex){
            i=200/0;
            return i;

        } finally {
            i=300;
        }
    }


}


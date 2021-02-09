package com.ss.practice;

public class Demo1 {
    public static void main(String[] args) {
        try{

        } catch(Exception ex){
            throw new RuntimeException();
        } finally {
            System.out.println("Here1");
           // throw new RuntimeException();
        }
        System.out.println("Here1");
    }

}

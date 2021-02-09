package com.ss.sagerra;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(throwMethod());
    }

    public static int throwMethod(){
        try{
            throw  new ClassNotFoundException();
        } catch (Exception ex){
            throw new NullPointerException();
        }
    }
}

package com.ss.sagerra;

public class MainClass {
    public static void main(String[] args) {
        Enums en=Enums.E;
        System.out.println(en);

        //System.out.println("11<22<33"+(11<22<33))   ;
    }
}

enum Enums{
    D,E,S;

    private Enums(){
        System.out.println(20);
    }
        }

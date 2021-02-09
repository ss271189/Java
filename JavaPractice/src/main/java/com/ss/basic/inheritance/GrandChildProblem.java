package com.ss.basic.inheritance;

public class GrandChildProblem {

    public static void main(String[] args) {
        Parenter p=new GrandChilder();
        p.method1();
    }
}

class Parenter{

    public void method1(){
        System.out.println("1");
    }
}

class Childer extends Parenter{
    public void method1(){
        System.out.println("2");
    }
    public void method2(){
        System.out.println("3");
    }
}

class GrandChilder extends Childer{
    public void method2(){
        System.out.println("4");
    }
}

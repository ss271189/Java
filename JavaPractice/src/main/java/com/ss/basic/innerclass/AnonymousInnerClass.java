package com.ss.basic.innerclass;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        Test t=new Test(){
            @Override
            public void display() {
                System.out.println("hey overridder ");
            }
        };
        t.display();


    }
}


class Test{
    public void display(){
        System.out.println("Hey");
    }
}

package com.ss.basic.innerclass;

public class InnerClassDemo1 {
    int a;

    public void display(){
       // System.out.println(b);
        System.out.println("Outer");
    }

    public static void main(String[] args) {
       InnerClassDemo1 obj=new InnerClassDemo1();
        InnerClass obj1=obj.new InnerClass();
        obj.display();
        obj1.display();
    }

    class InnerClass{
        int b;
        public void display(){
            System.out.println(a);
            System.out.println("Inner");
        }
    }
}

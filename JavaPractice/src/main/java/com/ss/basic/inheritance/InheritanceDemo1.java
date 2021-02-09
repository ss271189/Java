package com.ss.basic.inheritance;

public class InheritanceDemo1 {

    public static void main(String[] args) {

        Parent c=new Child();
       // Parent p =c;
      //  p.display();
        //System.out.println(" p.value = " +  p.value);
      //  System.out.println(" p.value = " +  c.value);


    }


}


class Parent
{
    Parent(){
        System.out.println("Parent");
    }
    int value = 1000;
    public void display(){
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    Child(){
        System.out.println("Child");
    }

    int value = 10;

    public void display(){
        System.out.println("Parent");
    }
}
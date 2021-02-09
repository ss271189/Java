package com.ss.basic;

public class DifferentWaysToCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //Way 1
        String obj=(String)Class.forName("java.lang.String").newInstance();
        System.out.println(obj);
         //Way2
        String obj1=new String();
        // Way 3
       //Using deserialization
        //ObjectInputStream inStream = new ObjectInputStream(anInputStream );
       // MyObject object = (MyObject) inStream.readObject();
        //Way 4
       // USeing clone
        //MyObject anotherObject = new MyObject();
        //MyObject object = (MyObject) anotherObject.clone();
        //Way 5
        // Using Reflection



    }
}

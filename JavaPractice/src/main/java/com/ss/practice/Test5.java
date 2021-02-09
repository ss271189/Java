package com.ss.practice;

import java.util.Collections;
import java.util.Map;

public class Test5  implements SomeInterface{


    @Override
    public int abstractMethod(int x, int y) {
        return 0;
    }

    public static void main(String[] args) {
        SomeInterface.NestedClass obj=new SomeInterface.NestedClass();
        obj.a=5;
    }
}



 interface SomeInterface {
    int SOME_CONSTANT = 35;
     int a=19;// variable declaration
    int abstractMethod(int x, int y);   // method declaration
    // nested class definition
    class NestedClass {
        // members of a class
        int a;
    }
    // nested interface definition
    interface NestedInterface {
        // member of an interface

        int a=19;

        //ExecutorService
    }
}

class GenricClass<T,U,R>{

}
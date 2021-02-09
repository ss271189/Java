package com.ss.java8.functional;

import java.util.function.*;

public class PrimitiveFunction {

    public static void main(String[] args) {

        IntFunction<Integer> ifun= x-> x*x;
        System.out.println(ifun.apply(2));

        ToIntFunction<String> ifun1= str-> str.length();
        System.out.println(ifun1.applyAsInt("Hello"));



    }
}

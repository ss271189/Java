package com.ss.java8.qa;
interface Interf {
    public void m1();
}
public class InnerLambdaTest {
    int x = 888;
    public void m2() {
        Interf i = () -> {
            int x = 999;
            System.out.println(this.x); // output is : 999, but expecting : 888 for this case. please                      tell if am doing wrong
        };
        i.m1();
    }
    public static void main(String[] args) {
        InnerLambdaTest t = new InnerLambdaTest();
        t.m2();
    }
}

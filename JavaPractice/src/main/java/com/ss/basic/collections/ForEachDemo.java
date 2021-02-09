package com.ss.basic.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(1);
        myList.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                int t=(Integer)o;
                if (t== 1) {
                    myList.remove(t);
                }
                System.out.println("forEach anonymous class Value::" + t);
            }

        });
    }
}

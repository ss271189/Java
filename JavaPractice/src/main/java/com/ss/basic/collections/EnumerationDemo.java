package com.ss.basic.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {

        Vector v=new Vector<>();
        for(int i=0;i<10;i++){
            v.addElement(i);
        }

        Enumeration e=v.elements();

        while (e.hasMoreElements())
        {
            System.out.println("e.nextElement() = " + e.nextElement());
        }


        ArrayList l=new ArrayList();
        for(int i=0;i<10;i++){
            l.add(i);
        }






    }
}

package com.ss.basic.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertieDemo {


    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("C:\\RS\\cgw\\cgw\\config\\ciscore.properties");
        p.load(fis);

        System.out.println(p);
        p.setProperty("Test","Test123");

        FileOutputStream fos=new FileOutputStream("C:\\RS\\cgw\\cgw\\config\\ciscore.properties");
        p.store(fos,"updated by shashank");

    }
}

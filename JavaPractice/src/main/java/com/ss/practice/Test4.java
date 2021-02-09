package com.ss.practice;

import java.io.IOException;

public class Test4 {

    int test=5;

    public void changeVal(Test4 t){
        t.test=50;
        t=null;
    }


    public static void main(String[] args) {
        int a=10;
        Test4 t=new Test4();
        t.changeVal(t);
        System.out.println(t.test);



        try{
            if(true)
                throw new CE();
            else
                throw new IOException();

        }catch (IOException e){

        }catch (CE e){

        }

    }
}


class CE extends  Exception{

}

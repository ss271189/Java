package com.ss.sagerra;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class T3 {

    public static void main(String[] args) {

        try {
            System.out.println(marshall(new Sample("Shashank",new int[]{1,2,3})));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


    static String marshall(Object o) throws IllegalAccessException {

        String cOpen="<$1>";
        String cClose="</$2>";
        String feilds1="<$3 type=\"$4\" modifier=\"$5\">$6</name>";

        String finalFeilds="";

        Class c = o.getClass();

        String className=c.getSimpleName();
        cOpen=cOpen.replace("$1",className);
        cClose=cClose.replace("$2",className);

        Field[] f=c.getDeclaredFields();

        for(Field fe:f){
            String feilds=feilds1;
            String fName=fe.getName();
            String  m=Modifier.toString(fe.getModifiers());
            String dataType=fe.getType().getSimpleName();
            Object o1=fe.get(o);
            feilds=feilds.replace("$3",fName);
            feilds=feilds.replace("$4",dataType);
            feilds=feilds.replace("$5",m);
            Class c2=fe.getType();

            feilds=feilds.replace("$6",o1.toString());
            finalFeilds=finalFeilds+feilds;
        }
       return cOpen+finalFeilds+cClose;
    }


}

class Sample{

   public String name;
   public int[] values;

    public Sample(String name, int[] values) {
        this.name = name;
        this.values = values;
    }
}


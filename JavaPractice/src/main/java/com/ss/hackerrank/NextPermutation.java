package com.ss.hackerrank;

import java.util.Arrays;

public class NextPermutation {


    static String biggerIsGreater(String w){
        if(w.length()==1){
            return "no answer";
        }
        int invesrse_point=w.length()-2;
        while (invesrse_point>=0 && w.charAt(invesrse_point)> w.charAt(invesrse_point+1)){
            invesrse_point--;
        }
        if(invesrse_point<0){
            return "no answer";
        }
        String fisrtPart=w.substring(0,invesrse_point+1);
        String last=w.substring(invesrse_point+1);
        char charArray[] = last.toCharArray();
        Arrays.sort(charArray);

        String finalS=fisrtPart+new String(charArray);
        int i=0;
        for( i=invesrse_point+1;i<finalS.length();i++){
            if(finalS.charAt(invesrse_point)<finalS.charAt(i)) break;
        }
        if(i>=finalS.length()){
            return "no answer";
        }
        return swap(finalS,invesrse_point,i);
    }


    static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void main(String[] args) {

        System.out.println(biggerIsGreater("bb"));
    }
}

package com.ss.hackerrank;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Java program to print all the permutations
// of the given string
public class GFG {
    static String biggerIsGreater(String w) {
       // Set<String> set=returnPermutn(w,"");
      /*  TreeSet<String> set1=new TreeSet<>(set);
        String s=set1.higher(w);
        if(s==null){
            return "no answer" ;
        } else {
            return s;
        }
*/
   return "";
    }

    static String returnPermutn(String str, String ans)
    {
        String ref="";
        String returnString=null;
        if (str.length() == 0) {
            return ans;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            String s=returnPermutn(ros, ans + ch);
           // if(s.compareTo(str)>0)
        }
        return "";
    }
    public static void main(String[] args)
    {
        String s = "abc";
        returnPermutn(s,"");

    }
}


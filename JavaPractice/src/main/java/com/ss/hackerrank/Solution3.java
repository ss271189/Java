package com.ss.hackerrank;

public class Solution3 {

    static String cipher(int k, String s) {
        String returnString = s.charAt(0) + "";
        int n=s.length()-k+1;
        int f=0;
        for(int i=1;i<n;i++)
        {
            f = f^(returnString.charAt(i-1)-'0');
            if(i>=k)
            {
                f = f^(returnString.charAt(i-k)-'0');
            }
            returnString =returnString + ((s.charAt(i)- '0')^f);
        }
        return returnString;
    }


    public static void main(String[] args) {
        System.out.println(cipher(4, "1110100110"));
    }
}

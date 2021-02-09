package com.ss.hackerrank;

public class KangarooProblem {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 > x2 && v1 > v2) {
            return "NO";
        } else if (x1 < x2 && v1 < v2) {
            return "NO";
        }
        int p1, p2, vp1, vp2;
        if (x1 < x2) {
            p1 = x1;
            vp1 = v1;
            p2 = x2;
            vp2 = v2;
        } else {
            p1 = x2;
            vp1 = v2;
            p2 = x1;
            vp2 = p2;
        }

        while (p1 < p2) {
            p1 = vp1 + p1;
            p2 = vp2 + p2;
        }

        if (p1 == p2) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        kangaroo(0,3,4,2);
    }
}
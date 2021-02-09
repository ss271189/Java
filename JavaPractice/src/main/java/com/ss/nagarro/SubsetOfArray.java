package com.ss.nagarro;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {


    public static void main(String[] args) {
        findSubset(new int[]{1, 2, 2, 3,3});
    }


    public static int[] findSubset(int a[]) {
        int n = a.length;
        List<Integer> finalList = new ArrayList<>();
        double maxDiff = Double.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> l = new ArrayList<Integer>();
            sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    l.add(a[j]);
                    sum += a[j];
                }
            }
            if (!l.isEmpty()) {
                int size = l.size();
                double mean = (double) sum / size;
                double median = 0;
                if (size % 2 == 0)
                    median = (l.get(size / 2) + l.get(size / 2 - 1))/2.0;
                else
                    median = l.get(size / 2);

                if (maxDiff < (mean-median)) {
                    maxDiff = mean - median;
                    finalList = l;
                }

            }
        }

        System.out.println(finalList);
        return finalList.stream().mapToInt(i->i).toArray();

    }

}

package com.ss.hackerrank;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirdProblem {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> myMap= arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //myMap.getClass()   .getName()

        System.out.println(myMap);

        Map<Integer, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        myMap.entrySet().stream()
                .sorted(new Comparator<Map.Entry<Integer, Long>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Long> o1, Map.Entry<Integer, Long> o2) {
                        long val1=o1.getValue();
                        int key1=o1.getKey();
                        int key2=o2.getKey();
                        long val2=o2.getValue();
                        if(val1>val2){
                            return 1;
                        } if(val2 >val1){
                           return -1;
                        } else {
                            if(key1>key2)
                                return 1;
                            else
                                return -1;
                        }
                    }
                }).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


        return finalMap.keySet().iterator().next();

    }
}

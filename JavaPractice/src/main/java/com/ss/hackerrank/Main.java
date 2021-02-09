package com.ss.hackerrank;/*
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {

    public static Map<String,Integer> processData(ArrayList<String> array) {

        Map<String,Integer> map=new HashMap<>();
        for(String s:array){
            String str[]=s.split(",");
            String con=str[2].trim();
            if(map.containsKey(con)){
                int val=map.get(con);
                if(val<Integer.valueOf(str[3].trim())){
                    map.put(con,Integer.valueOf(str[3].trim()));
                }
            } else{
                map.put(con,Integer.valueOf(str[3].trim()));
            }
        }
        System.out.println(map);
       return map;
    }

    static class Candidate{
         Integer id;
         String name;
         String place;
         Integer votes;

        public Candidate(Integer id, String name, String place, Integer votes) {
            this.id = id;
            this.name = name;
            this.place = place;
            this.votes = votes;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public Integer getVotes() {
            return votes;
        }

        public void setVotes(Integer votes) {
            this.votes = votes;
        }

        @Override
        public String toString() {
            return "Candidate{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", place='" + place + '\'' +
                    ", votes=" + votes +
                    '}';
        }
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("C:\\Users\\esshaua.ERICSSON\\Downloads\\input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\esshaua.ERICSSON\\Downloads\\output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}

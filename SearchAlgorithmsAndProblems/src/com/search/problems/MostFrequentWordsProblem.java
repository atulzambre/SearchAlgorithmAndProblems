package com.search.problems;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentWordsProblem {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/atulzambre/Documents/work/IntelliJ_Projects/SearchAlgorithmAndProblems/SearchAlgorithmsAndProblems/src/resources/WordFrequecyInput.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        StringBuilder allBook=new StringBuilder();
        while ((st = br.readLine()) != null) {
            allBook=allBook.append(" "+st);
            System.out.println(st);
        }
    Map<String,Integer> wordFrequency=findWordFrequency(allBook);
        System.out.println("sorted map");

      //add sorting and print the top 5 from hashmap
    }

    public static Map<String,Integer> findWordFrequency(StringBuilder allBook){
        Map<String,Integer> frequencyWord=new HashMap<>();
        String splittedString[]=allBook.toString().split(" ");
        for(int i=0;i<splittedString.length;i++){
            if(frequencyWord.containsKey(splittedString[i])){
                int frequency=frequencyWord.get(splittedString[i]);
                frequencyWord.put(splittedString[i],frequency+1);
            }
            else {
                frequencyWord.put(splittedString[i],1);
            }
        }

        return frequencyWord;
    }
}

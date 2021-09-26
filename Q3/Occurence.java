package com.ttn.Q3;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
    public static void main(String[] args) {
        String str = "Elephant is the largest land animal";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

package com.ttn.Q2;

import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        String str="hello how are you";
        char[] ch=str.toCharArray();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(ch[i]);
        }

        System.out.println(set);
    }
}

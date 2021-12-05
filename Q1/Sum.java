package com.ttn.Q1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Float> list= new LinkedList<>();
        float sum=0;
        list.add(10.5f);
        list.add(20.2f);
        list.add(30.3f);
        list.add(40.6f);
        list.add(50.06f);
        System.out.println(list);

        Iterator<Float> iterator = list.iterator();
        while(iterator.hasNext()){
            sum=sum+iterator.next();
        }
        System.out.println("sum of all elements in list is : "+sum);
    }
}

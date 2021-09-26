package com.ttn.Q6;

import java.util.*;

public class Frequency {
    public static void main(String[] args)
    {
        int[] array = { 6,4, 4, 3, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();
        for (int current : array) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }
        SortComparator comp = new SortComparator(map);

        Collections.sort(outputArray, comp);
        for (Integer i : outputArray) {
            System.out.print(i + " ");
        }
    }
}

package com.ttn.Q6;

import java.util.Comparator;
import java.util.Map;

public class SortComparator implements Comparator<Integer> {
    private final Map<Integer, Integer> freqMap;
    SortComparator(Map<Integer, Integer> tFreqMap)
    {

        this.freqMap = tFreqMap;
    }
    @Override
    public int compare(Integer k1, Integer k2)
    {
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

        int valueCompare = k1.compareTo(k2);

        if (freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }

}

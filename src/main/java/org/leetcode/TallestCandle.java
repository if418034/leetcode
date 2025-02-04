package org.leetcode;

import java.util.*;

public class TallestCandle {
    public static void main(String[] args) {
        Integer[] nsts = {3 ,2 ,1 ,3};
        List candleList = Arrays.stream(nsts).toList();
        System.out.println(countTallest(candleList));
    }

    public static int countTallest(List<Integer> candles) {
        Map<Integer, Integer> candlesMap = new HashMap<>();
        int max = 0;
        for (int candle:
                candles) {
            if (candle > max) {
                max = candle;
            }
            candlesMap.put(candle, candlesMap.getOrDefault(candle, 0) + 1);
        }
        return candlesMap.get(max);
    }
}

package org.leetcode;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] input = {1,4,6,2,4,2,6,8,9,12};
        System.out.println(longestConsecutive(input));
    }

    public static int longestConsecutive(int[] nums) {
        SortedSet<Integer> integers = new TreeSet<>();
        boolean as = false;
        for (int num : nums){
            integers.add(num);
        }

        int a = as ? 0 : 1;

        for (int i = 0; i < nums.length; i++) {

        }
        return 0;
    }
}

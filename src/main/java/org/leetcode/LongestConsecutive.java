package org.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] inp = {0,1,1,3,5,6,6,1,2,3,4,1,5,5,2,3,1,2,7,8,9,2,4,3,36,37,38,39,40,41,42,43,44,45, 100,102};
        System.out.println(longestConsecutive(inp));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> asr = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            asr.add(nums[i]);
        }

        for (int i = 0; i < asr.size(); i++) {

        }
        return 0;
    }
}

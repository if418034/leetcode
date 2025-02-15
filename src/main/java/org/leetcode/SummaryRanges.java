package org.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] input = {4, 5, 6, 7, 11, 23, 67, 88, 89, 90, 100, 101, 103};
        System.out.println(summaryRanges(input));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i - 1] + 1 != nums[i]) {
                if (nums[i - 1] == start) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        return result;
    }
}

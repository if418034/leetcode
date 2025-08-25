package org.leetcode;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] input = {1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(input)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                result[i] *= nums[j];
            }
        }
        return result;
    }
}

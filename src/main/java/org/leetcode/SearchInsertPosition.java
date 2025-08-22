package org.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length < 1) return 0;
        int i = 0;
        while (i < nums.length) {
            if (i + 1 > nums.length) {
                return nums.length;
            }
            if (nums[i] <= target && nums[i + 1] >= target) {
                return i + 1;
            }
            i++;
        }
        return 0;
    }
}

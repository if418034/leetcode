package org.leetcode;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] input = {2, 1};
//        int[] input = {2, 3, 1, 1, 4};
        System.out.println(jump(input));
    }

    public static int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int jumps = 0;

        int current_reach = 0;

        int farthest_reach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest_reach = Math.max(farthest_reach, i + nums[i]);

            if (i == current_reach) {
                jumps++;
                current_reach = farthest_reach;
                if (current_reach >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}

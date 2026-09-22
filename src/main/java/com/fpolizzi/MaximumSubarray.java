package com.fpolizzi;

/**
 * Created by fpolizzi on 9/22/26
 */
public class MaximumSubarray {

    private Integer[][] memo;

    public int maxSubArray(int[] nums) {
        memo = new Integer[nums.length][2];
        return dfs(nums, 0, false);
    }

    private int dfs(int[] nums, int i, boolean flag) {
        if (i == nums.length - 1) return flag ? Math.max(0, nums[i]) : nums[i];

        int f = flag ? 1 : 0;

        if (memo[i][f] != null) return memo[i][f];

        memo[i][f] = Math.max(flag ? 0 :
                dfs(nums, i + 1, false), nums[i] + dfs(nums, i + 1, true));

        return memo[i][f];
    }
}

package com.fpolizzi;

import java.util.*;

/**
 * Created by fpolizzi on 8/16/26
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) return new ArrayList<>();

        // sort the elements in nums
        Arrays.sort(nums);

        // create a set to store result triplets
        Set<List<Integer>> result = new HashSet<>();

        // now fix the first element and find the other two elements
        for (int i = 0; i < nums.length - 2; i++) {

            // find other two elements using TwoSum approach
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    // add valid triplet to the
                    // result set and find other triplets
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }

        return new ArrayList<>(result);
    }
}

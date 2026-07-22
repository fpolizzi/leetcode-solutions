package com.fpolizzi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 7/22/26
 */
public class TwoSum {

    static void main() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementValue = target - nums[i];

            if (map.containsKey(complementValue)) {
                return new int[]{map.get(complementValue), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No match found");
    }
}

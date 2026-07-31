package com.fpolizzi;

/**
 * Created by fpolizzi on 7/24/26
 */
public class MajorityElement {

    static void main() {

        int[] nums = {2, 2, 1, 3, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int majority = nums[0], counts = 1;

        for (int i = 1; i < nums.length; i++) {
            if (counts == 0) {
                counts++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                counts++;
            } else {
                counts--;
            }
        }

        return majority;
    }
}

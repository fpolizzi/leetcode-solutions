package com.fpolizzi;

/**
 * Created by fpolizzi on 7/29/26
 */
public class BinarySearch {

    static void main() {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int middle;

        while (start < end) {
            middle = start + (end - start) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle;
            } else {
                start = middle + 1;
            }

        }

        if (nums[start] == target) {
            return start;
        }

        return -1;
    }
}

package com.fpolizzi;

/**
 * Created by fpolizzi on 7/30/26
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;

        while (left < right) {

            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        if (left == right && isBadVersion(left)) {
            return left;
        }

        return -1;
    }
}
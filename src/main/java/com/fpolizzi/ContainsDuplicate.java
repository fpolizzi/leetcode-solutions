package com.fpolizzi;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fpolizzi on 7/25/26
 */
public class ContainsDuplicate {

    static void main() {

        int[] nums = {1, 2, 3, 4, 3, 5, 6};

        System.out.println((containsDuplicate(nums)));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if(integerSet.contains(num))
                return true;

            integerSet.add(num);
        }

        return false;
    }
}

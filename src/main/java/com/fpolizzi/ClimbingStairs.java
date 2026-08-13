package com.fpolizzi;

/**
 * Created by fpolizzi on 8/13/26
 */
public class ClimbingStairs {

    void main() {

        System.out.println(climbStairs(10));
    }

    public int climbStairs(int n) {

        if (n == 1) return 1;

        int[] step = new int[n + 1];

        // two possible combinations of steps | one or two
        step[1] = 1;
        step[2] = 2;

        for (int i = 3; i <= n ; i++) {
            step[i] = step[i - 1] + step[i - 2];
        }

        return step[n];
    }
}

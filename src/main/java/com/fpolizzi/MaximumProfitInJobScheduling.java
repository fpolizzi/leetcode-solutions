package com.fpolizzi;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by fpolizzi on 9/27/26
 */
public class MaximumProfitInJobScheduling {

    private int[] startTime, endTime, profit, cache;
    private Integer[] index;
    private int n;

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        this.n = startTime.length;
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
        this.index = new Integer[n];
        this.cache = new int[n];
        Arrays.fill(cache, -1);

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, Comparator.comparingInt(i -> startTime[i]));

        return dfs(0);
    }

    private int dfs(int i) {
        if (i == n) {
            return 0;
        }
        if (cache[i] != -1) {
            return cache[i];
        }

        int res = dfs(i + 1);

        int left = i + 1, right = n, j = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (startTime[index[mid]] >= endTime[index[i]]) {
                j = mid;
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return cache[i] = Math.max(res, profit[index[i]] + dfs(j));
    }
}

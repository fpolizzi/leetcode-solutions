package com.fpolizzi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fpolizzi on 8/19/26
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        // sort by ascending starting point
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals){
            if (interval[0] <= newInterval[1]) {
                // if overlapping intervals, update the end
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // disjoint intervals, add new interval to the result
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}

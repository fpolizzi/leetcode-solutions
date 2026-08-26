package com.fpolizzi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 8/26/26
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0) {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            // Traverse Right
            for (int j = columnBegin; j <= columnEnd; j++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(matrix[j][columnEnd]);
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = columnEnd; j >= columnBegin; j--) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                // Traverse Up
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][columnBegin]);
                }
            }
            columnBegin++;
        }

        return res;
    }
}

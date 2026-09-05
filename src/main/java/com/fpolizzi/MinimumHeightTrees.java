package com.fpolizzi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 9/5/26
 */
public class MinimumHeightTrees {

    private List<List<Integer>> adj;
    private int[][] dp;

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        dp = new int[n][2]; // top two heights for each node
        dfs(0, -1);
        dfs1(0, -1, 0);

        int minHgt = n;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            minHgt = Math.min(minHgt, dp[i][0]);
        }
        for (int i = 0; i < n; i++) {
            if (minHgt == dp[i][0]) {
                res.add(i);
            }
        }
        return res;
    }

    private void dfs(int node, int parent) {

        for (int nei : adj.get(node)) {

            if (nei == parent) continue;
            dfs(nei, node);

            int curHgt = 1 + dp[nei][0];

            if (curHgt > dp[node][0]) {
                dp[node][1] = dp[node][0];
                dp[node][0] = curHgt;
            } else if (curHgt > dp[node][1]) {
                dp[node][1] = curHgt;
            }
        }
    }

    private void dfs1(int node, int parent, int topHgt) {

        if (topHgt > dp[node][0]) {
            dp[node][1] = dp[node][0];
            dp[node][0] = topHgt;
        } else if (topHgt > dp[node][1]) {
            dp[node][1] = topHgt;
        }

        for (int nei : adj.get(node)) {
            if (nei == parent) continue;

            int toChild;

            if (dp[node][0] == (1 + dp[nei][0])) toChild = 1 + dp[node][1];

            else toChild = 1 + dp[node][0];
            dfs1(nei, node, toChild);
        }
    }
}

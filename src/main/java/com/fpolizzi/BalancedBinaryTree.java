package com.fpolizzi;

/**
 * Created by fpolizzi on 8/3/26
 */
public class BalancedBinaryTree {

    static void main() {
    }

    public boolean isBalanced(TreeNode root) {

        return getHeight(root) != Integer.MAX_VALUE;
    }

    private int getHeight(TreeNode node) {
        if (node == null)
            return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE ||
                Math.abs(left - right) > 1) {
            return Integer.MAX_VALUE;
        }

        return Math.max(left, right) + 1;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

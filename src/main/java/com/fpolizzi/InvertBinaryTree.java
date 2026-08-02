package com.fpolizzi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fpolizzi on 8/2/26
 */
public class InvertBinaryTree {

    static void main() {
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();

            // swap nodes
            final TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // add left and right of this node to the queue
            if (node.left != null) queue.add(node.left);

            if (node.right != null) queue.add(node.right);
        }

        return root;
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
    public static class TreeNode {
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

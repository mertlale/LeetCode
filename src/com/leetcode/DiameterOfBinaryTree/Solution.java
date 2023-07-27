package com.leetcode.DiameterOfBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {

        calculateHeight(root);
        return diameter;
    }

    public int calculateHeight(TreeNode node) {

        // nodeHeight = 1 + max(left.height, right.height); If the node is null then its height is -1.
        // Bottom nodes heights become zero with this equation.
        // nodeDiameter = left.height + right.height + 2;  Adding 2 at the end (1 for each child)
        if (node == null) return -1;

        int leftHeight= calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        diameter = Math.max(diameter ,leftHeight + rightHeight + 2);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

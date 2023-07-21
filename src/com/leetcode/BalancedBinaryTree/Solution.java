package com.leetcode.BalancedBinaryTree;

// Solution with 1 ms (%92) and 43.2 MB (%63.51)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        // we will use only first element of the array returned from the dfs function (1 = true, 0 = false)
        return dfs(root)[0] == 1;
    }

    // returns array which states ["is the node balanced (1 or 0)", "height of the node"]
    // To find if the node is balanced or not, we need to return the heights of the children nodes(left and right)
    public int[] dfs(TreeNode root) {

        if (root == null)
            return new int[]{1, 0};

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        // evaluate the balance condition (left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1) and convert it to int from boolean by ternary operator
        int balanced = (left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1) ? 1 : 0;
        int height = 1 + Math.max(left[1], right[1]);

        return new int[]{balanced, height};
    }

}

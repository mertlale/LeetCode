package com.leetcode.BalancedBinaryTree;

public class TestBalancedBinaryTree {
    public static void main(String[] args) {
        // Test Case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        Solution solution = new Solution();
        boolean isBalanced1 = solution.isBalanced(root1);
        System.out.println("Is Binary Tree Balanced? " + isBalanced1); // Output: true

        // Test Case 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);
        boolean isBalanced2 = solution.isBalanced(root2);
        System.out.println("Is Binary Tree Balanced? " + isBalanced2); // Output: false
    }
}

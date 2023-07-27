package com.leetcode.DiameterOfBinaryTree;

public class TestDiameterOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create the binary tree: [1, 2, 3, 4, 5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the Binary Tree: " + solution.diameterOfBinaryTree(root)); // Output: 3
    }
}


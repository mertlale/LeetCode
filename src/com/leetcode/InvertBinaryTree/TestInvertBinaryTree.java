package com.leetcode.InvertBinaryTree;

public class TestInvertBinaryTree {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Print the original root
        printInOrder(root);
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Invert the binary tree
        TreeNode invertedTree = solution.invertTree(root);

        // Print the inverted tree
        System.out.println();
        printInOrder(invertedTree);
    }

    private static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        // Print left subtree
        printInOrder(node.left);

        // Print current node
        System.out.print(node.val + " ");

        // Print right subtree
        printInOrder(node.right);
    }
}

package com.leetcode.LowestCommonAncestor;

public class TestLowestCommonAncestor {
    public static void main(String[] args) {
        // Test Case 1
        TreeNode root1 = new TreeNode(6);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(4);
        root1.left.right.left = new TreeNode(3);
        root1.left.right.right = new TreeNode(5);
        root1.right.left = new TreeNode(7);
        root1.right.right = new TreeNode(9);
        TreeNode p1 = root1.left;
        TreeNode q1 = root1.right;
        Solution solution = new Solution();
        TreeNode result1 = solution.lowestCommonAncestor(root1, p1, q1);
        System.out.println("Lowest Common Ancestor: " + result1.val); // Output: 6

        // Test Case 2
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(1);
        root2.right.right = new TreeNode(7);
        TreeNode p2 = root2.left.left.left;
        TreeNode q2 = root2.left.right;
        TreeNode result2 = solution.lowestCommonAncestor(root2, p2, q2);
        System.out.println("Lowest Common Ancestor: " + result2.val); // Output: 3
    }
}
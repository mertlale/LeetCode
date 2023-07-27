package com.leetcode.MaximumDepthOfBinaryTree;

public class TestMaximumDepthOfBinaryTree {
    // Helper method to create a binary tree from an array of values using level-order traversal.
    private static TreeNode createBinaryTree(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        TreeNode root = new TreeNode(values[0]);
        queue.offer(root);

        int index = 1;

        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            if (values[index] != null) {
                current.left = new TreeNode(values[index]);
                queue.offer(current.left);
            }
            index++;

            if (index < values.length && values[index] != null) {
                current.right = new TreeNode(values[index]);
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Integer[] values1 = {3, 9, 20, null, null, 15, 7};
        TreeNode root1 = createBinaryTree(values1);
        System.out.println("Maximum Depth: " + solution.maxDepth(root1)); // Output: 3

        Integer[] values2 = {1, 2, null, 3, null, 4, null, 5};
        TreeNode root2 = createBinaryTree(values2);
        System.out.println("Maximum Depth: " + solution.maxDepth(root2)); // Output: 5

        Integer[] values3 = {0,2,4,1,null,3,-1,5,1,null,6,null,8};
        TreeNode root3 = createBinaryTree(values3);
        System.out.println("Maximum Depth: " + solution.maxDepth(root3)); // Output: 4
    }
}

package com.leetcode.MaximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/*
1) Solution with DFS (Depth-First Search) (Recursion)
Find the height of the root, then add 1.
 */

//public class Solution {
//    public int maxDepth(TreeNode root) {
//
//        // Max depth = root.height + 1
//        return calculateHeight(root) + 1;
//    }
//
//    public int calculateHeight(TreeNode node) {
//
//        if (node == null) return -1;
//        // nodeHeight = max(left.height, right.height) + 1
//        return  1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
//    }
//}

// This solution also can be simplified like below:
// Depth of null node is 0.

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


/*
2) Solution with BFS (Breadth-First Search) (Level-Order Traversal)
Depth will be equal to the level of the leaf nodes. Implement with queue (Linked List in Java).
 */
//public class Solution {
//    public int maxDepth(TreeNode root) {
//
//        if (root == null) return 0;
//
//        int level = 0;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            int qLength = q.size();
//            for (int i = 0; i < qLength; i++) {
//                TreeNode node = q.remove();
//                if (node.left != null) q.add(node.left);
//                if (node.right != null) q.add(node.right);
//            }
//            level++;
//        }
//
//        return level;
//    }
//}

/*
3) Solution with Stack (DFS Iteration)
 */

//public class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        Stack<Object[]> stack = new Stack<>();
//        stack.push(new Object[]{root, 1});
//        int res = 1;
//
//        while (!stack.isEmpty()) {
//            Object[] item = stack.pop();
//            TreeNode node = (TreeNode) item[0]; // We need to cast Object type to their original types
//            int depth = (int) item[1];
//
//            if (node != null) {
//                res = Math.max(res, depth);
//                stack.push(new Object[]{node.left, depth + 1});
//                stack.push(new Object[]{node.right, depth + 1});
//            }
//        }
//
//        return res;
//    }
//}









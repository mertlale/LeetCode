package com.leetcode.LowestCommonAncestor;

//Definition for a binary tree node.

// We can't create public class for TreeNode if we are in the same java class.
// For public class, we need to separate java files for TreeNode.java and Solution.java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode cur = root;

        while (cur != null){

            if (p.val < cur.val && q.val < cur.val)
                cur = cur.left;
            else if (p.val > cur.val && q.val > cur.val)
                cur = cur.right;
            else
                return cur;
        }

        return null;
    }
}

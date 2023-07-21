package com.leetcode.LinkedListCycle;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/*
Floyd's Tortoise and Hare Algorithm --> Two pointers, 1st(slow) moves 1 step and 2nd(fast) moves 2 step. The fast will
catch the slow after finishing the first cycle (If there is a cycle).
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Check if the linked list is empty or the next node is null(means there is no cycle)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}

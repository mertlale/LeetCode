package com.leetcode.MiddleOfLinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
1) Solution with holding the positions
Runtime = 0 ms (Beats 100%)
Memory = 39.8 Mb (Beats 84.83%)
 */

public class Solution {

    public ListNode middleNode(ListNode head) {

        ListNode prev = head;
        ListNode cur = head;
        int cur_pos = 1;
        int prev_pos = 1;

        while (cur.next != null) {
            cur = cur.next;
            cur_pos++;

            while (prev_pos < (cur_pos / 2 + 1)) {
                prev = prev.next;
                prev_pos++;
            }
        }

        return prev;
    }
}

/*
2) Solution with slow and fast pointers like Floyd's Tortoise and Hare Algorithm.
Fast goes 2 step, slow goes 1.
When fast finishes the list, slow will be in the middle of the linked list.
Runtime = 0 ms (Beats 100%)
Memory = 40.38 Mb (Beats 23.38%)
 */

//public class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//    }
//}